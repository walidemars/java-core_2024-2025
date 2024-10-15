package lr1;

import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = in.nextInt();

        int num1, num2, num3;

        num1 = num - 1;
        num2 = num + 1;
        num3 = num + num1 + num2;
        num3 = num3 * num3;

        System.out.println(num1 + " " + num + " " + num2 + " " + num3);

        in.close();
    }
}
