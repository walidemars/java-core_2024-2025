package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework10 {

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

        for (int i = 0; i < size; i++ ) {

            for (int j = 0; j < size; j++) {

                if (nums[i] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Сортировка массива по убыванию");

        for (int i = 0; i < size; i++) {
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }
    }
}

