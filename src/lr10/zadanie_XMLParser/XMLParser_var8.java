package lr10.zadanie_XMLParser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XMLParser_var8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            File inputFile = new File("src/lr10/zadanie_XMLParser/zadanie2_2.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            
            System.out.println("Хотите внести данные нового сотрудника? (y/n)");
            String yOrN = in.next();
            in.nextLine();

            if (yOrN.equals("y")){

                AddEmployee(in, doc);
            }

            System.out.println("Хотите выполнить поиск сотрудника? (y/n)");
            yOrN = in.next();
            in.nextLine();

            if (yOrN.equals("y")){

                SearchEmployees(in, doc);
            }

            System.out.println("Хотите удалить сотрудника? (y/n)");
            yOrN = in.next();
            in.nextLine();

            if (yOrN.equals("y")){

                DeleteEmployee(in, doc);
            }

            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("employee");
            for(int i = 0; i < nodeList.getLength(); i++){
                Node node = nodeList.item(i);
                System.out.println("\nТекущий элемент: " + node.getNodeName());

                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    System.out.println("Полное имя: " +
                            element.getElementsByTagName("full_name").item(0).getTextContent());
                    System.out.println("Дата рождения: " +
                            element.getElementsByTagName("date_of_birth").item(0).getTextContent());
                    System.out.println("Должность: " +
                            element.getElementsByTagName("position").item(0).getTextContent());
                }
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void AddEmployee(Scanner in, Document _doc) throws TransformerException {
        Element rootElement = _doc.getDocumentElement();

        System.out.println("Введите полное имя сотрудника:");
        in.nextLine();
        String fullName = in.nextLine();
        System.out.println("Введите дату рождения сотрудника:");
        String dateOfBirth = in.nextLine();
        System.out.println("Введите должность сотрудника:");
        String position = in.nextLine();

        Element employee = _doc.createElement("employee");
        rootElement.appendChild(employee);

        Element full_name = _doc.createElement("full_name");
        full_name.appendChild(_doc.createTextNode(fullName));
        employee.appendChild(full_name);

        Element date_of_birth = _doc.createElement("date_of_birth");
        date_of_birth.appendChild(_doc.createTextNode(dateOfBirth));
        employee.appendChild(date_of_birth);

        Element position1 = _doc.createElement("position");
        position1.appendChild(_doc.createTextNode(position));
        employee.appendChild(position1);

        SaveDoc(_doc);

        System.out.println("Сотрудник добавлен!");
    }

    private static void SaveDoc(Document doc) throws TransformerException {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("src/lr10/zadanie_XMLParser/zadanie2_2.xml"));
        transformer.transform(source, result);
    }

    private static void SearchEmployees(Scanner in, Document doc) throws Exception {
        System.out.println("Найти по ФИО - 1\nНайти по должности - 2");
        int searchMethod = in.nextInt();
        in.nextLine();

        NodeList employeeList = doc.getElementsByTagName("employee");
        String searchValue = "";

        if (searchMethod == 1) {
            System.out.println("Введите ФИО сотрудника: ");
            searchValue = in.nextLine();
        } else if (searchMethod == 2) {
            System.out.println("Введите должность сотрудника: ");
            searchValue = in.nextLine();
        } else {
                System.out.println("Некоррекнтый выбор");
        }

        List<Element> foundEmployees = new ArrayList<>();
        for(int i = 0; i < employeeList.getLength(); i++){
            Element employee = (Element) employeeList.item(i);
            String currentValue;
            if (searchMethod == 1){
                currentValue = employee.getElementsByTagName("full_name").item(0).getTextContent();
            } else {
                currentValue = employee.getElementsByTagName("position").item(0).getTextContent();
            }

            if(currentValue.equalsIgnoreCase(searchValue)){
                foundEmployees.add(employee);
            }
        }

        if (foundEmployees.isEmpty()){
            System.out.println("Сотрудники не найдены");
        } else {
            System.out.println("Найденные сотрудники: ");
            for (Element employee : foundEmployees){
                String full_name = employee.getElementsByTagName("full_name").item(0).getTextContent();
                String date_of_birth = employee.getElementsByTagName("date_of_birth").item(0).getTextContent();
                String position1 = employee.getElementsByTagName("position").item(0).getTextContent();
                System.out.printf("ФИО: %s, Дата рождения: %s, Должность: %s\n", full_name, date_of_birth, position1);
            }
        }
    }

    public static void DeleteEmployee(Scanner in, Document doc){
        NodeList employeeList = doc.getElementsByTagName("employee");
        System.out.println("Введите ФИО сотрудника для удаления: ");
        String employeeToDelete = in.nextLine();


        for(int i = 0; i < employeeList.getLength(); i++){
            Element employee = (Element) employeeList.item(i);
            String full_name = employee.getElementsByTagName("full_name").item(0).getTextContent();

            if(full_name.equals(employeeToDelete)){
                Node parentNode = employee.getParentNode();
                parentNode.removeChild(employee);

                break;
            }
        }
    }
}
