package lr10.zadanie_JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONParser_var8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить нового сотрудника");
            System.out.println("2. Поиск сотрудника по ФИО");
            System.out.println("3. Удалить сотрудника по ФИО");
            System.out.println("4. Отобразить всех сотрудников");
            System.out.println("5. Выход");
            System.out.print("Выберите действие: ");

            int choice = in.nextInt();
            in.nextLine();

            try {
                switch (choice) {
                    case 1:
                        AddEmployee(in);
                        break;
                    case 2:
                        SearchEmployee(in);
                        break;
                    case 3:
                        DeleteEmployee(in);
                        break;
                    case 4:
                        ShowJSON();
                        break;
                    case 5: {
                        System.out.println("Выход из программы.");
                        in.close();
                        return;
                    }
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static JSONObject LoadJSON() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("src/lr10/zadanie_JSONParser/zadanie-json.json"));
        return (JSONObject) obj;
    }

    private static void SaveJSON(JSONObject json) throws IOException {
        try (FileWriter writer = new FileWriter("src/lr10/zadanie_JSONParser/zadanie-json.json")) {
            writer.write(json.toString()); // Форматирование с отступами
        }
    }

    public static void ShowJSON(){
        try {
            JSONObject jsonObject = LoadJSON();
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("employee");

            for (Object o : jsonArray){
                JSONObject employee = (JSONObject) o;
                System.out.println("\nТекущий элемент employee");
                System.out.println("ФИО сотрудника: " + employee.get("fullName"));
                System.out.println("Дата рождения: " + employee.get("dateOfBirth"));
                System.out.println("Должность: " + employee.get("position"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void AddEmployee(Scanner in) throws IOException, ParseException {
        JSONObject jsonObject = LoadJSON();
        JSONArray jsonArray = (JSONArray) jsonObject.get("employee");

        System.out.print("Введите ФИО сотрудника: ");
        String fullName = in.nextLine();
        System.out.print("Введите дату рождения сотрудника: ");
        String dateOfBirth = in.nextLine();
        System.out.print("Введите должность сотрудника: ");
        String position = in.nextLine();

        JSONObject newEmployee = new JSONObject();
        newEmployee.put("fullName", fullName);
        newEmployee.put("dateOfBirth", dateOfBirth);
        newEmployee.put("position", position);
        jsonArray.add(newEmployee);

        SaveJSON(jsonObject);

        System.out.println("Сотрудник успешно добавлен!");
    }

    public static void SearchEmployee(Scanner in) throws IOException, ParseException {
        JSONObject jsonObject = LoadJSON();
        JSONArray jsonArray = (JSONArray) jsonObject.get("employee");
        System.out.print("Введите ФИО сотрудника для поиска: ");
        String fullName = in.nextLine();

        System.out.println("\nРезультаты поиска:");
        jsonArray.forEach(employee -> {
            if (employee instanceof JSONObject) {
                JSONObject emp = (JSONObject) employee;
                String empName = (String) emp.get("fullName");
                if (fullName.equals(empName)) {
                    System.out.println("\nТекущий элемент: employee");
                    System.out.println("ФИО: " + emp.get("fullName"));
                    System.out.println("Дата рождения: " + emp.get("dateOfBirth"));
                    System.out.println("Позиция: " + emp.get("position"));
                }
            }
        });
    }

    public static void DeleteEmployee(Scanner in) throws IOException, ParseException {
        JSONObject jsonObject = LoadJSON();
        JSONArray jsonArray = (JSONArray) jsonObject.get("employee");
        System.out.print("Введите ФИО сотрудника для удаления: ");
        String fullName = in.nextLine();

        Iterator iterator = jsonArray.iterator();
        while (iterator.hasNext()){
            JSONObject employee = (JSONObject) iterator.next();
            if (fullName.equals(employee.get("fullName"))){
                iterator.remove();
            }
        }

        System.out.println("Сотрудник удален.");
        SaveJSON(jsonObject);
    }
}
