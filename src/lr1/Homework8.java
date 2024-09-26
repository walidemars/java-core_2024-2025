package lr1;

import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter A: ");
        int a = in.nextInt();

        System.out.println("Enter B: ");
        int b = in.nextInt();

        int sum;
        sum = a + b;

        System.out.println("A + B = " + sum);

        in.close();

    }
}
