package timus;

import java.util.Scanner;

public class task1924 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        if (sum % 2 == 0) {
            System.out.println("black");
        }
        else {
            System.out.println("grimy");
        }

        in.close();
    }

}
