package timus;

import java.util.Scanner;

public class task2001 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] A = new int[3];
        int[] B = new int[3];

        for (int i = 0; i < 3; i++) {

            System.out.println("Ввод " + i + " строки");

            int a = in.nextInt();
            int b = in.nextInt();

            A[i] = a;
            B[i] = b;
        }

        int matB = A[1] - A[0];
        int matA = B[2] - B[0];

        System.out.println("Первый математик собрал " + matA + " кг. Второй математик собрал " + matB + " кг.");
    }
}

