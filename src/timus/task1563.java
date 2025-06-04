package timus;

import java.util.HashSet;
import java.util.Scanner;

public class task1563 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        HashSet<String> visitedShops = new HashSet<>();
        int bayanCount = 0;

        for (int i = 0; i < N; i++) {
            String shop = in.nextLine();
            if (visitedShops.contains(shop)) {
                bayanCount++;
            } else {
                visitedShops.add(shop);
            }
        }

        System.out.println(bayanCount);
    }
}
