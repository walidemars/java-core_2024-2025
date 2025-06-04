package timus;

import java.util.Scanner;

public class task1636 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T1 = in.nextInt();
        int T2 = in.nextInt();

        int totalPenaltyAttempts = 0;
        for (int i = 0; i < 10; i++) {
            totalPenaltyAttempts += in.nextInt();
        }

        int penaltyMinutes = totalPenaltyAttempts * 20;
        int idealT2 = T2 - penaltyMinutes;

        if (idealT2 < T1) {
            System.out.println("Dirty debug :(");
        } else {
            System.out.println("No chance.");
        }
    }
}
