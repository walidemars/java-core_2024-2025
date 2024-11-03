package lr3;

import java.util.Scanner;

public class Homework3_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел в последовательности Фибоначчи:");
        int size = in.nextInt();
        int[] nums = new int[size];

        nums[0] = 1;
        nums[1] = 1;

        int i = 2;
        while (i < size) {
            nums[i] = nums[i - 1] + nums[i - 2];
            i++;
        }

        System.out.println("Последовательность Фибоначчи:");

        i = 0;
        while (i < size) {
            System.out.print(nums[i] + " ");
            i++;
        }
    }
}
