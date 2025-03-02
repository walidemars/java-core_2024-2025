package Grokaem_algoritm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Создаем массив со случайными числами и сортируем по возрастанию
        Random random = new Random();

        int size = random.nextInt(200);

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) arr[i] = random.nextInt(200);

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) System.out.println(arr[i]);

        // Алгоритм бинарного поиска
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;
        int guess = arr[mid];

        System.out.println("Введите искомое значение от 0 до 200");
        int item = in.nextInt();

        while (low <= high) {
            mid = (low + high) / 2;
            guess = arr[mid];

            if (guess == item) {
                System.out.println("Искомое значение " + guess);
                break;
            }
            else if (guess > item){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
    }
}
