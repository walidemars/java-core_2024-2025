package lr1;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите возраст: ");
        int age = in.nextInt();

        int year;
        year = 2024 - age;

        System.out.println("Год рождения: " + year);

        in.close();

    }
}
