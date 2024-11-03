package lr3;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;

        do {
            System.out.println("Введите размер массива:");
            size = in.nextInt();
            if (size < 1) System.out.println("Размер массива должен быть больше нуля");
            else break;
        } while (size < 1);

        int[] nums = new int[size];

        int b = 0;

        for (int i = 0; i < size; i++) {
            for (int n = b; n > -1; n++) {

                if (n % 5 == 2) {
                    nums[i] = n;
                    b = n + 1;
                    break;
                }
            }

            System.out.print(nums[i] + " ");
        }
    }
}
