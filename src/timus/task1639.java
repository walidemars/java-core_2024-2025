package timus;

import java.util.Scanner;

public class task1639 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        if ((m*n-1) % 2 == 0) System.out.println("[second]=:]");
        else System.out.println("[:=[first]");

        in.close();
    }
}
