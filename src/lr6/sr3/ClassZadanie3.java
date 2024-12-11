package lr6.sr3;

import java.util.Arrays;
import java.util.Scanner;

public class ClassZadanie3 {

    static Scanner in = new Scanner(System.in);

    static void maxMinAv1(int a) {
        System.out.println("Передано одно значение: " + a);
    }

    static void maxMinAv1(int a, int b) {
        System.out.println("Максимальное значение: " + Math.max(a, b));
        System.out.println("Минимальное значение: " + Math.min(a, b));
        System.out.println("Среднее значение: " + (a + b)/2);
    }

    static void maxMinAv2(int numberOfnumbers) {
        int[] numb = new int[numberOfnumbers];
        for (int i = 0; i < numb.length; i++) {
            System.out.println("Введите число: ");
            numb[i] = in.nextInt();
        }

        Arrays.sort(numb);
        System.out.println("Максимальное значение: " + numb[numb.length - 1]);
        System.out.println("Минимальное значение: " + numb[0]);

        int sum = 0;
        for (int i = 0; i < numb.length; i++) {
            sum += numb[i];
        }
        int av = sum/numb.length;

        System.out.println("Среднее значение: " + av);
    }
}
