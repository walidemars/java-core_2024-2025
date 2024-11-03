package lr3;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Создание объекта класса Scanner для считывания числа введенного в консоль
        Scanner id = new Scanner(System.in);

        // Сообщение пользователю для красоты и понимания
        System.out.println("Введите размер массива");

        // Запись в переменную Size (нужная, для того чтобы задать размер массива)
        int size = id.nextInt();

        // Значения введенного в консоль
        System.out.println("Размер массива равен " + size);

        // Создание массива размером введенным из консоли
        int[] nums = new int[size];

        // Создание объекта класса Random для генерации "случайного" числа
        Random random = new Random();

        for (int i = 0; i < nums.length; i++){
            // Присвоение i-тому элементу массива случайного значения
            nums[i] = random.nextInt(200);
            // Сообщение пользователю для красоты и понимания
            System.out.println("Элемент массива  ["+i+"] = " + nums[i]);
        }

        // Поиск минимального элемента массива
        int min = 0;
        for (int i = 0; i < nums.length; i++){
            min = nums[i];
            for (int j = 0; j < nums.length; j++){
                if (min > nums[j]) {
                    min = nums[j];
                }
            }
        }
        // Вывод минимальных элементов массива
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min)
                System.out.println("Минимальный элемент массива равен ["+i+"]" + nums[i]);
        }


        // Сортировка массива по возрастанию его элементов
        Arrays.sort(nums);
        // Сообщение пользователю для красоты и понимания
        System.out.println("Произведена сортировка массива");

        for (int i = 0; i < nums.length; i++) {
            // Сообщение пользователю для красоты и понимания
            System.out.println("Элемент массива ["+i+"] после сортировки = " + nums[i]);
        }
    }
}
