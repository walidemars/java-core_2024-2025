package lr10.zadanie_XMLParser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.dom.DOMSource;
import java.io.File;

public class CreateXML_var8 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Создание корневого элемента
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("employees");
            doc.appendChild(rootElement);

            // Добавление первой книги
            Element employee1 = doc.createElement("employee");
            rootElement.appendChild(employee1);

            Element full_name1 = doc.createElement("full_name");
            full_name1.appendChild(doc.createTextNode("Иванов И.И."));
            employee1.appendChild(full_name1);

            Element date_of_birth1 = doc.createElement("date_of_birth");
            date_of_birth1.appendChild(doc.createTextNode("02.02.1990"));
            employee1.appendChild(date_of_birth1);

            Element position1 = doc.createElement("position");
            position1.appendChild(doc.createTextNode("Разработчик"));
            employee1.appendChild(position1);

            // Добавление второй книги
            Element employee2 = doc.createElement("employee");
            rootElement.appendChild(employee2);

            Element full_name2 = doc.createElement("full_name");
            full_name2.appendChild(doc.createTextNode("Петров П.П."));
            employee2.appendChild(full_name2);

            Element date_of_birth2 = doc.createElement("date_of_birth");
            date_of_birth2.appendChild(doc.createTextNode("05.05.1988"));
            employee2.appendChild(date_of_birth2);

            Element position2 = doc.createElement("position");
            position2.appendChild(doc.createTextNode("Менеджер"));
            employee2.appendChild(position2);

            // Запись XML-файла
            doc.setXmlStandalone(true);
            doc.normalizeDocument();

            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty(javax.xml.transform.OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");

            javax.xml.transform.dom.DOMSource source = new DOMSource(doc);
            javax.xml.transform.stream.StreamResult result =
                    new javax.xml.transform.stream.StreamResult(new File("src/lr10/zadanie_XMLParser/zadanie2_2.xml"));
            transformer.transform(source, result);

            System.out.println("XML-файл успешно создан!");
        } catch (Exception pce){
            pce.printStackTrace();
        }
    }
}
