package lr3;

import java.util.Scanner;

public class Homework5_for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел:");
        int size = in.nextInt();
        int[] nums = new int[size];

        int b = 0;

        for (int i = 0; i < size; i++) {
            for (int n = b; n > -1; n++) {

                if (n % 5 == 2) {
                    nums[i] = n;
                    b = n + 1;
                    break;
                } else if (n % 3 == 1) {
                    nums[i] = n;
                    b = n + 1;
                    break;
                }
            }

            System.out.print(nums[i] + " ");

        }
    }
}
