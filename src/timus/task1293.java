package timus;

import java.util.Scanner;
import java.io.PrintWriter;

public class task1293 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        int result = a * b * n * 2;


        out.println(result);
        out.flush();
    }
}
