package timus;

import java.util.Scanner;

public class task1881 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int w = in.nextInt();
        int n = in.nextInt();

        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = in.next();
        }

        int pages = 1;
        int currentLineLength = 0;
        int currentLineCount = 0;

        for (String word : words) {
            int wordLength = word.length();

            if (currentLineLength == 0) {
                currentLineLength = wordLength;
                currentLineCount++;
            } else if (currentLineLength + 1 + wordLength <= w) {
                currentLineLength += 1 + wordLength;
            } else {
                currentLineLength = wordLength;
                currentLineCount++;
            }

            if (currentLineCount > h) {
                pages++;
                currentLineCount = 1;
            }
        }
        System.out.println(pages);
    }
}
