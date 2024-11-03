package lr3;

import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] symbols = new char[10];

        char b = 'A';

        for (int i = 0; i < 10;) {

            if (b == 'A' || b == 'E' || b == 'I') {
                b += 1;
            }
            else {
                symbols[i] = b;
                b += 1;
                System.out.print(symbols[i] + " ");
                i++;
            }
        }
    }
}
