package timus;

import java.util.Scanner;

public class task1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        System.out.println(n * (m + 1));

        in.close();
    }
}
