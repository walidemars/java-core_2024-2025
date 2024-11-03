package lr3;

import java.util.Scanner;

public class Homework4_for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое целое число:");
        int num1 = in.nextInt();
        System.out.println("Введите второе целое число:");
        int num2 = in.nextInt();

        int min = num1 < num2 ? num1 : num2;
        int max = num1 > num2 ? num1 : num2;

        for (; min <= max; min++)
            System.out.println(min);
    }
}
