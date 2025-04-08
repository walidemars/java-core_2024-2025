package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Zadanie9 {
    public static void main(String[] args) {

        String string = "The Stre213am -5API is a new1 wa1y to wor-k with data* structures in/ a functional sty//le.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования: " + "\n");

        for(String e : strings) {
            System.out.println(e);
        }

        List<String> stringAfter = StringFilter(strings);

        System.out.println("\n" + "Строка после преобразования: " + "\n");
        for (String e : stringAfter) {
            System.out.println(e);
        }
    }

    public static List<String> StringFilter (List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());
    }
}
