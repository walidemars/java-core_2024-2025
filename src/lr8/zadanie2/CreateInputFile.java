package lr8.zadanie2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CreateInputFile {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);

        // Создание файла и запись данных
        try (PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream("E:\\My\\input.txt"), "UTF-8"))) {
            // Запрашиваем первую строку
            System.out.println("Введите первую строку:");
            String firstLine = in.nextLine();
            writer.println(firstLine);

            // Запрашиваем вторую строку
            System.out.println("Введите вторую строку:");
            String secondLine = in.nextLine();
            writer.println(secondLine);

            // Запрашиваем 5 чисел типа double
            System.out.println("Введите 5 вещественных чисел:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Число " + (i + 1) + ": ");
                while (true) {
                    try {
                        double number = Double.parseDouble(in.nextLine());
                        writer.println(number);
                        break; // Выход из цикла, если ввод валиден
                    } catch (NumberFormatException e) {
                        System.out.println("Некорректный ввод. Пожалуйста, введите вещественное число.");
                    }
                }
            }
            System.out.println("Данные успешно записаны в файл E:\\My\\input.txt.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        // Переписываем файл

        BufferedReader br = null;
        PrintWriter out = null;

        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\My\\input.txt"), "UTF-8"));
            out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("E:\\My\\output.txt"), "UTF-8"));

            // Чтение первой строки
            String firstLine = br.readLine();
            // Чтение второй строки
            String secondLine = br.readLine();
            out.println(secondLine); // Запись второй строки в выходной файл

            String line;
            while ((line = br.readLine()) != null) {
                try {
                    double number = Double.parseDouble(line);
                    if (number > 0) { // Проверка на положительное число
                        out.println(number); // Запись положительного числа в выходной файл
                    }
                } catch (NumberFormatException e) {
                    // Игнорируем, если не удалось преобразовать строку в число
                }
            }
            System.out.println("Данные успешно записаны в файл E:\\My\\output.txt.");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
                if (out != null) {
                    out.flush();
                    out.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии потоков: " + e.getMessage());
            }
        }

        // Вывод данных файлов в консоль
        String inputFilePath = "E:\\My\\input.txt";
        String outputFilePath = "E:\\My\\output.txt";

        // Вывод содержимого input.txt
        System.out.println("Содержимое файла input.txt:");
        displayFileContents(inputFilePath);

        // Вывод содержимого output.txt
        System.out.println("\nСодержимое файла output.txt:");
        displayFileContents(outputFilePath);
    }


    private static void displayFileContents(String filePath) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла " + filePath + ": " + e.getMessage());
        }
    }
}
