package lr3;

import java.util.Scanner;

public class Homework2_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название дня недели");
        String dayOfWeek = in.nextLine();

        switch (dayOfWeek){
            case "понедельник", "Понедельник":
                System.out.println("Номер дня недели = 1");
                break;
            case "вторник", "Вторник":
                System.out.println("Номер дня недели = 2");
                break;
            case "среда", "Среда":
                System.out.println("Номер дня недели = 3");
                break;
            case "четверг", "Четверг":
                System.out.println("Номер дня недели = 4");
                break;
            case "пятница", "Пятница":
                System.out.println("Номер дня недели = 5");
                break;
            case "суббота", "Суббота":
                System.out.println("Номер дня недели = 6");
                break;
            case "воскресенье", "Воскресенье":
                System.out.println("Номер дня недели = 7");
                break;
            default:
                System.out.println("Нет такого дня недели");
                break;
        }
    }
}
