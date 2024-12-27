package timus;

import java.util.Scanner;

public class task1313 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sideSquare = in.nextInt();

        int[][] image = new int[sideSquare][sideSquare];

        System.out.println("Количество пикселей на стороне: " + sideSquare);
        System.out.println("Введите изображение обычной видеокарты:");
        for(int i = 0; i < sideSquare; i++) {
            for(int j = 0; j < sideSquare; j++) {
                image[i][j] = in.nextInt();
            }
        }
        System.out.println("Изображение, которое выводит обычная видеокарта:");
        for(int i = 0; i < sideSquare; i++) {
            for(int j = 0; j < sideSquare; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Последовательность для ввода в новый монитор:");
        for(int k = 0; k < sideSquare; k++) {
            int j = 0;
            int i = k;
            while (i >= 0) {
                System.out.println(image[i][j] + " ");
                i--;
                j++;
            }
        }

        for (int k = 1; k < sideSquare; k++) {
            int j = k;
            int i = sideSquare - 1;
            while (j < sideSquare) {
                System.out.println(image[i][j] + " ");
                i--;
                j++;
            }
        }
        in.close();
    }
}
