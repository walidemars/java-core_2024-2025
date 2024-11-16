package lr4;

import java.util.Random;

public class Homework6 {
    public static void main(String[] args) {

        int rows = 5;
        int columns = 5;
        int z;

        Random random = new Random();

        int originalArr[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                originalArr[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Созданный массив: ");

        for (int i = 0; i < rows; i++) {
            System.out.print("номер строки: " + i + " ");
            z = 0;
            for (int j = 0; j < columns; j++) {
                System.out.print(originalArr[i][j] + " ");
                z += 1;
            }
            System.out.println(" Количество символов в строке " + z);
        }
        System.out.println();

        int deleteRow = random.nextInt(rows);
        int deleteColumn = random.nextInt(columns);
        System.out.println("Номер удаляемой строки: " + deleteRow);
        System.out.println("Номер удаляемого столбца: " + deleteColumn);

        System.out.println("Массив после удаления столбцов и строк: ");

        int changedArr[][] = new int[rows - 1][columns - 1];

        for (int i = 0, changei = 0; i < rows; i++) {
            if (i == deleteRow) continue;
            for (int j = 0, changej = 0; j < columns; j++) {
                if (j == deleteColumn) continue;
                changedArr[changei][changej] = originalArr[i][j];
                changej++;
            }
            changei++;
        }

        for (int i = 0; i < rows - 1; i++) {
            System.out.print("номер строки: " + i + " ");
            z = 0;
            for (int j = 0; j < columns - 1; j++) {
                System.out.print(changedArr[i][j] + " ");
                z += 1;
            }
            System.out.println(" Количество символов в строке " + z);
        }
    }
}
