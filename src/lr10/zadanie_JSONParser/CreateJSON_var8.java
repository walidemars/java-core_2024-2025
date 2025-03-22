package lr10.zadanie_JSONParser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class CreateJSON_var8 {
    public static void main(String[] args) {

        JSONObject employees = new JSONObject();
        JSONArray employee = new JSONArray();

        JSONObject employee1 = new JSONObject();
        employee1.put("fullName", "Иванов И.И.");
        employee1.put("dateOfBirth", "10.10.1990");
        employee1.put("position", "Менеджер");

        JSONObject employee2 = new JSONObject();
        employee2.put("fullName", "Петров П.П.");
        employee2.put("dateOfBirth", "12.12.1990");
        employee2.put("position", "Разработчик");

        employee.add(employee1);
        employee.add(employee2);

        employees.put("employee", employee);

        try (FileWriter file = new FileWriter("src/lr10/zadanie_JSONParser/zadanie-json.json")){
            file.write(employees.toJSONString());
            System.out.println("Json файл успешно создан!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
