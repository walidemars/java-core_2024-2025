package lr13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        try {
            System.out.println("Введите номер столбца:");
            int col = in.nextInt();
            for (int i = 0; i < matrix.length; i++){
                System.out.println(matrix[i][col]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введена строка вместо числа");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка: столбец не существует");
        } finally {
            in.close();
        }
    }
}
