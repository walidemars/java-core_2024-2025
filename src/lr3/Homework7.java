package lr3;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] symbols = new char[10];

        char b = 'a';

        int a = 0;

        for (int i = 0; i < 10; i++) {
            if (i == 13){
                a = i;
                break;
            }

            symbols[i] = b;
            b += 2;
            a = i;

            System.out.print(symbols[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < j) {
                    char temp = symbols[j];
                    symbols[j] = symbols[i];
                    symbols[i] = temp;
                }
            }
        }
        for (int i = 0; i < 10; i++)
            System.out.print(symbols[i] + " ");
    }
}
