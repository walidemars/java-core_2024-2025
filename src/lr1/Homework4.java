package lr1;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String month = in.nextLine();

        System.out.println("Введите количество дней месяца: ");
        int num = in.nextInt();

        System.out.println(month + " содержит " + num + " дней");

        in.close();

    }
}
