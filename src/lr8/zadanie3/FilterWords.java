package lr8.zadanie3;

import java.io.*;

public class FilterWords {
    public static void main(String[] args) {
        // Пути к файлам
        String inputFilePath = "E:\\My\\zadanie3.txt";
        String outputFilePath = "E:\\My\\zadanie3Out.txt";

        // Согласные буквы русского алфавита
        String consonants = "бвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            int lineNumber = 0;

            // Чтение файла построчно
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                String[] words = line.split("\\s+"); // Разделение строки на слова
                int wordCount = 0;

                // Проверка каждого слова
                for (String word : words) {
                    if (!word.isEmpty() && consonants.contains(String.valueOf(word.charAt(0)))) {
                        wordCount++;
                        writer.write("Строка " + lineNumber + ": " + word);
                        writer.newLine();
                    }
                }

                // Запись количества слов для текущей строки
                writer.write("Количество слов: " + wordCount);
                writer.newLine();
                writer.newLine(); // Пустая строка для разделения
            }

            System.out.println("Обработка завершена. Результат записан в файл: " + outputFilePath);

        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлами: " + e.getMessage());
        }

        // Вывод содержимого исходного файла в консоль
        System.out.println("\nСодержимое исходного файла (" + inputFilePath + "):");
        printFileContent(inputFilePath);

        // Вывод содержимого нового файла в консоль
        System.out.println("\nСодержимое нового файла (" + outputFilePath + "):");
        printFileContent(outputFilePath);
    }

    // Метод для вывода содержимого файла в консоль
    private static void printFileContent(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
