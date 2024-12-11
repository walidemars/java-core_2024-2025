package lr6.sr10;

import java.util.Arrays;
import java.util.Scanner;

public class ClassZadanie10 {

    static Scanner in = new Scanner(System.in);

    static int[] maxAndMin (int numbers) {
        int[] arr = new int[numbers];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите число:");
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[arr.length - 1];

        return new int[]{max, min};
    }
}
