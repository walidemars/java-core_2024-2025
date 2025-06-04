package timus;

import java.util.*;

public class task1110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int Y = in.nextInt();

        List<Integer> result = new ArrayList<>();

        for (int X = 0; X < M; X++) {
            if (modPow(X, N, M) == Y) {
                result.add(X);
            }
        }

        if (result.isEmpty()) {
            System.out.println(-1);
        } else {
            Collections.sort(result);
            for (int i = 0; i < result.size(); i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(result.get(i));
            }
            System.out.println();
        }
    }

    private static int modPow(int X, int N, int M) {
        int result = 1;
        X = X % M;
        for (int i = 0; i < N; i++) {
            result = (result * X) % M;
        }
        return result;
    }
}
