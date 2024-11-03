package lr3;

import java.util.Scanner;

public class Homework3_for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел в последовательности Фибоначчи:");
        int size = in.nextInt();
        int[] nums = new int[size];

        nums[0] = 1;
        nums[1] = 1;

        for (int i = 2; i < size; i++)
            nums[i] = nums[i - 1] + nums[i - 2];

        System.out.println("Последовательность Фибоначчи:");

        for (int i = 0; i < size; i++)
            System.out.print(nums[i] + " ");
    }
}
