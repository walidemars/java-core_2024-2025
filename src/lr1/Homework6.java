package lr1;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите год рождения");
        int year = in.nextInt();

        int age;
        age = 2024 - year;

        System.out.println("Ваше имя: " + name + "; ваш возраст: " + age);

        in.close();

    }
}
