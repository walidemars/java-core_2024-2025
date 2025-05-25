package lr13;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte[] arr = new byte[3];
        int sum = 0;

        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Введите элемент " + (i+1) + ": ");
                int value = in.nextInt();
                if (value < Byte.MIN_VALUE || value > Byte.MAX_VALUE) {
                    throw new ArithmeticException("Значение за пределами byte");
                }
                arr[i] = (byte) value;
                sum += arr[i];
            }
            System.out.println("Сумма: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введена строка вместо числа");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            in.close();
        }
    }
}
