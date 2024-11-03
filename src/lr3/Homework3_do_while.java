package lr3;

import java.util.Scanner;

public class Homework3_do_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел в последовательности Фибоначчи:");
        int size = in.nextInt();
        int[] nums = new int[size];

        nums[0] = 1;
        nums[1] = 1;

        int i = 2;

        do {
            nums[i] = nums[i - 1] + nums[i - 2];
            i++;
        } while (i < size);

        System.out.println("Последовательность Фибоначчи:");

        i = 0;

        do {
            System.out.print(nums[i] + " ");
            i++;
        } while (i < size);
    }
}
