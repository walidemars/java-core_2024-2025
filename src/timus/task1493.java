package timus;

import java.util.Scanner;

public class task1493 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ticket = in.nextInt();

        int a = ticket / 1000;
        int b = ticket - a * 1000;
        int sum1 = 0, sum2 = 0, sum3 = 0;
        int b1 = b + 1;
        int b2 = b - 1;

        while (b1 != 0){
            sum2 += (b1 % 10);
            b1 /= 10;
        }
        while (b2 != 0){
            sum3 += (b2 % 10);
            b2 /= 10;
        }
        while (a != 0){
            sum1 += (a % 10);
            a /= 10;
        }

        if (sum1 == sum2 || sum1 == sum3) System.out.println("Yes");
        else System.out.println("No");
    }
}
