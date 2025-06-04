package timus;

import java.util.Scanner;

public class task1243 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String N = in.nextLine();
        int remainder = 0;
        
        for (int i = 0; i < N.length(); i++) {
            char digit = N.charAt(i);
            remainder = (remainder * 10 + (digit - '0')) % 7;
        }

        System.out.println(remainder);
    }
}
