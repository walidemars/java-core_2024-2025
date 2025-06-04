package timus;

import java.util.Scanner;

public class task2056 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[]ocenki = new int[n];
        float ball = 0;
        int countFives = 0;
        boolean threeExist = false;

        for (int i = 0; i < n; i++){
            ocenki[i] = in.nextInt();
            if (ocenki[i] == 3) threeExist = true;
            if (ocenki[i] == 5) countFives++;

            ball += ocenki[i];
        }
        if(threeExist){
            System.out.println("None");
            return;
        }

        if (countFives == n){
            System.out.println("Named");
            return;
        }

        if(ball / n >= 4.5 && ball / n < 5){
            System.out.println("High");
        }
        else {
            System.out.println("Common");
        }
    }
}
