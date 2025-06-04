package timus;

import java.util.Scanner;

public class task1327 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        int firstBurnDay = (A % 2 == 1) ? A : A + 1;

        int lastBurnDay = (B % 2 == 1) ? B : B - 1;

        int count = 0;
        if (firstBurnDay <= lastBurnDay) {
            count = ((lastBurnDay - firstBurnDay) / 2) + 1;
        }

        System.out.println(count);
    }
}
