package lr1;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter A: ");
        int a = in.nextInt();

        System.out.println("Enter B: ");
        int b = in.nextInt();

        int sum = a + b;
        int dif1 = a - b;
        int dif2 = b - a;

        System.out.println("A + B = " + sum);
        System.out.println("A - B = " + dif1);
        System.out.println("B - A = " + dif2);

        in.close();
    }
}
