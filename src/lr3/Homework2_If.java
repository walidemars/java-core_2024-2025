package lr3;

import java.util.Scanner;

public class Homework2_If {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название дня недели");
        String dayOfWeek = in.nextLine();

        if (dayOfWeek.equals("понедельник") || dayOfWeek.equals("Понедельник"))
            System.out.println("Номер дня недели = 1");
        else if (dayOfWeek.equals("вторник") || dayOfWeek.equals("Вторник"))
            System.out.println("Номер дня недели = 2");
        else if (dayOfWeek.equals("среда") || dayOfWeek.equals("Среда"))
            System.out.println("Номер дня недели = 3");
        else if (dayOfWeek.equals("четверг") || dayOfWeek.equals("Четверг"))
            System.out.println("Номер дня недели = 4");
        else if (dayOfWeek.equals("пятница") || dayOfWeek.equals("Пятница"))
            System.out.println("Номер дня недели = 5");
        else if (dayOfWeek.equals("суббота") || dayOfWeek.equals("Суббота"))
            System.out.println("Номер дня недели = 6");
        else if (dayOfWeek.equals("воскресенье") || dayOfWeek.equals("Воскресенье"))
            System.out.println("Номер дня недели = 7");
        else
            System.out.println("Не существует такого дня недели");
    }
}
