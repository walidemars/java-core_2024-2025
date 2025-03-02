package Grokaem_algoritm;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Создаем массив со случайными числами и сортируем по возрастанию
        Random random = new Random();

        int size = random.nextInt(10);

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) arr[i] = random.nextInt(10);

        // Метод сортировки выбором
        ArrayList<Integer> newArr = selectionSort(arr);

        for (int i = 0; i < newArr.size(); i++) System.out.println(newArr.get(i));
    }

    // Поиск наименьшего элемента массива
    public static int findSmallest(int arr[]) {
        int smallest = arr[0];
        int smallest_index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallest_index = i;
            }
        }
        return smallest_index;
    }

    // Сортировка выбором
    public static ArrayList<Integer> selectionSort(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        ArrayList<Integer> copiedArr = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            copiedArr.set(i, arr[i]);
        }

        for (int i = 0; i < copiedArr.size(); i++) {
            int smallest = findSmallest(arr);
            newArr.add(copiedArr.remove(smallest));
        }
        return newArr;
    }
}
