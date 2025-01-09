package lr8.example7;

import java.io.*;

public class Buf_RW_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        BufferedWriter out = null;

        try {
            // Создание файловых символьных потоков для чтения и записи
            br = new BufferedReader(new FileReader("E:\\My\\MyFile1.txt"), 1024); // 1024 размер буфера
            out = new BufferedWriter(new FileWriter("E:\\My\\MyFile2.txt"));

            int lineCount = 0; // счетчик строк
            String s;

            //Переписывание информации из одного файла в другой
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ":" + s);
                out.write(s);
                out.newLine(); // переход на новую строку
            }
        } catch (IOException e) {
            System.out.println("Ошибка!" + e.getMessage());
        }
        finally {
            // Закрытие потоков с проверкой на null
            try {
                if (br != null) {
                    br.close();
                }
                if (out != null) {
                    out.flush();
                    out.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии потоков: " + e.getMessage());
            }
        }
    }
}
