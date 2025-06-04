package timus;

import java.util.Scanner;

public class task1654 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(removeDuplicatePairs(s));
    }

    public static String removeDuplicatePairs(String s) {
        char[] stack = new char[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (top >= 0 && stack[top] == current) {
                top--;
            } else {
                stack[++top] = current;
            }
        }
        return new String(stack, 0, top + 1);
    }
}
