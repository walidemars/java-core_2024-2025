package lr1;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите год рождения: ");
        int year = in.nextInt();

        int age;
        age = 2024 - year;

        System.out.println("Ваш возраст: " + age);

        in.close();

    }
}
