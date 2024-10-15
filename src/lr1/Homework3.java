package lr1;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите текущий день недели: ");
        String day = in.nextLine();

        System.out.println("Введите текущий месяц: ");
        String month = in.nextLine();

        System.out.println("Введите текущую дату (номер дня в месяце): ");
        int date = in.nextInt();

        System.out.println("Сегодняшняя дата: " + day + " " + date + " " + month);

        in.close();

    }
}
