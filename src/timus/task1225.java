package timus;

import java.util.Scanner;

public class task1225 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        if (N == 1) {
            System.out.println(2);
            return;
        }

        long[] dp = new long[N + 1];
        dp[1] = 2;
        dp[2] = 2;

        for (int n = 3; n <= N; n++) {
            dp[n] = dp[n - 1] + dp[n - 2];
        }

        System.out.println(dp[N]);
    }
}
