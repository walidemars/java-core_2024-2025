package timus;

import java.util.Scanner;

public class task1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int sum = 0;

        if (N >= 1) {
            for (int i = 1; i <= N; i++){
                sum += i;
            }
        }
        else {
            for (int i = 1; i >= N; i--){
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
