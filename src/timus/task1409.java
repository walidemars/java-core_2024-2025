package timus;

import java.util.Scanner;
import java.io.PrintWriter;

public class task1409 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int g = in.nextInt();
        int l = in.nextInt();

        int banki = g + l - 1;

        int not_g = banki - g;
        int not_l = banki - l;


        out.println(not_g);
        out.println(not_l);

        out.flush();
        in.close();
    }
}
