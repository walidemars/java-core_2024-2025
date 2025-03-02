package lr9;

import java.util.HashMap;
import java.util.Map;

public class zadanie6 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Zero");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven67");
        map.put(8, "Eight");
        map.put(9, "Nine5678");

        System.out.println("Строки, ключ которых > 5: ");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getValue());
            }
        }

        System.out.println("\nСтроки, ключ которых = 0: ");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() == 0) {
                System.out.print(entry.getValue());
            }
        }

        System.out.println("\nПеремноженные ключи, длина строк которых > 5: ");
        int multiplyKeys = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                multiplyKeys *= entry.getKey();
            }
        }
        System.out.println(multiplyKeys);
    }
}
