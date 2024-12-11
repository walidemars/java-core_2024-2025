package timus;

import java.util.Scanner;

public class task1880 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int[] player1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            player1[i] = in.nextInt();
        }

        int n2 = in.nextInt();
        int[] player2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            player2[i] = in.nextInt();
        }

        int n3 = in.nextInt();
        int[] player3 = new int[n3];
        for (int i = 0; i < n3; i++) {
            player3[i] = in.nextInt();
        }

        int i = 0, j = 0, k = 0;
        int commonCount = 0;

        while (i < n1 && j < n2 && k < n3) {
            if (player1[i] == player2[j] && player2[j] == player3[k]) {
                commonCount++;
                i++;
                j++;
                k++;
            } else if (player1[i] < player2[j]) {
                i++;
            } else if (player2[j] < player3[k]) {
                j++;
            } else {
                k++;
            }
        }

        System.out.println(commonCount);

        in.close();

    }
}
