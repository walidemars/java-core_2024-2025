package timus;

import java.util.Scanner;

public class task1991 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int[] bombs = new int[n];
        int ostatokBomb = 0;
        int droids = n * k;

        for (int i = 0; i < n; i++){
            bombs[i] = in.nextInt();
            if (bombs[i] >= k){
                ostatokBomb += bombs[i] - k;
                droids -= k;
            }
            else {
                droids -= bombs[i];
            }
        }
        System.out.println(ostatokBomb);
        System.out.println(droids);
    }
}
