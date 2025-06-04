package timus;

import java.util.Scanner;

public class task1581 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] sequence = new int[N];

        for (int i = 0; i < N; i++) {
            sequence[i] = in.nextInt();
        }
        StringBuilder result = new StringBuilder();
        if (N == 0) {
            System.out.println();
            return;
        }
        int currentNumber = sequence[0];
        int count = 1;
        for (int i = 1; i < N; i++) {
            if (sequence[i] == currentNumber) {
                count++;
            } else {
                result.append(count).append(" ").append(currentNumber).append(" ");
                currentNumber = sequence[i];
                count = 1;
            }
        }
        result.append(count).append(" ").append(currentNumber);
        System.out.println(result);
    }
}
