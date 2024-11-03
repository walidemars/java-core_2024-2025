package lr3;

import java.util.Scanner;

public class Homework5_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел:");
        int size = in.nextInt();
        int[] nums = new int[size];

        int b = 0;
        int i = 0;

        while (i < size) {

            int n = 0;
            while (n > -1) {
                n = b;

                if (n % 5 == 2) {
                    nums[i] = n;
                    b = n + 1;
                    break;
                } else if (n % 3 == 1) {
                    nums[i] = n;
                    b = n + 1;
                    break;
                } else {
                    b = n + 1;

                    n++;
                }
            }
            System.out.print(nums[i] + " ");
            i++;
        }
    }
}
