package timus;

import java.util.Scanner;

public class task1893 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        int row = Integer.parseInt(input.replaceAll("[^0-9]", ""));
        char seat = input.replaceAll("[^A-Za-z]", "").charAt(0);

        if (row >= 1 && row <= 2) {
            if (seat == 'A' || seat == 'D') {
                System.out.println("window");
            } else if (seat == 'B' || seat == 'C') {
                System.out.println("aisle");
            } else {
                System.out.println("neither");
            }
        } else if (row >= 3 && row <= 20) {
            if (seat == 'A' || seat == 'F') {
                System.out.println("window");
            } else if (seat == 'B' || seat == 'C' || seat == 'D' || seat == 'E') {
                System.out.println("aisle");
            } else {
                System.out.println("neither");
            }
        } else if (row >= 21 && row <= 65) {
            if (seat == 'A' || seat == 'K') {
                System.out.println("window");
            } else if (seat == 'C' || seat == 'D' || seat == 'G' || seat == 'H') {
                System.out.println("aisle");
            } else if (seat == 'B' || seat == 'E' || seat == 'F' || seat == 'J') {
                System.out.println("neither");
            } else {
                System.out.println("neither");
            }
        } else {
            System.out.println("neither");
        }
    }
}
