package lr13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int sizeArr = in.nextInt();
        int sum = 0, count = 0;

        int[] arr = new int[sizeArr];

        try{
            for (int i = 0; i < arr.length; i++){
                System.out.println("Введите элемент массива: ");
                arr[i] = in.nextInt();

                if (arr[i] > 0){
                    sum += arr[i];
                    count++;
                }
            }
            if (count == 0){
                throw new NoPositiveElementsExeption("Нет положительных элементов");
            }
            System.out.println("Среднее: " + (sum / count));
        } catch (InputMismatchException e){
            System.out.println("Ошибка: введена строка вместо числа");
        } catch (NoPositiveElementsExeption e){
            System.out.println(e.getMessage());
        } finally {
            in.close();
        }
    }
}

class NoPositiveElementsExeption extends Exception{
    public NoPositiveElementsExeption(String message){
        super(message);
    }
}
