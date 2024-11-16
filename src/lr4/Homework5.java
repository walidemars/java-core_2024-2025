package lr4;

import java.util.Random;

public class Homework5 {
    public static void main(String[] args) {

        int width = 5;
        int height = 8;
        int z;

        Random random = new Random();

        int originalArr[][] = new int[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                originalArr[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Созданный массив: ");

        for (int i = 0; i < width; i++) {
            System.out.print("номер строки " + i + ": ");
            z = 0;
            for (int j = 0; j < height; j++) {
                System.out.print(originalArr[i][j] + " ");
                z += 1;
            }
            System.out.println(" Количество символов в строке " + z);
        }

        System.out.println();
        System.out.println("Массив после смены местами столбцов и строк: ");

        int transposedArr[][] = new int[height][width];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                transposedArr[j][i] = originalArr[i][j];
            }
        }

        for (int i = 0; i < height; i++) {
            System.out.print("номер строки " + i + ": ");
            z = 0;
            for (int j = 0; j < width; j++) {
                System.out.print(transposedArr[i][j] + " ");
                z += 1;
            }
            System.out.println(" Количество символов в строке " + z);
        }
    }
}
