package lr8.example3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class File_ByteRead_SamBuff {

    // Считывание по 5 символов (буфер)
    public static void readAllByArray(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        /*while (true) {
            int count = in.read();
            if(count != -1) { // если не конец файла
                // Данные буфера преобразовываются в строку
                System.out.println("количество = " + count + ", buff = "
                + Arrays.toString(buff) + ", str = "
                + new String(buff, 0, count, "cp1251")); //UTF8
            } else {
                break;
            }
        }*/
        int readBytes;
        while ((readBytes = in.read(buff)) != -1) {
            // Создаем строку только из прочитанных байтов
            String result = new String(buff, 0, readBytes);
            System.out.println(result); // Выводим результат
        }
    }

    public static void main(String[] args) throws IOException {

        String fileName = "E:\\My\\MyFile1.txt";
        InputStream inFile = null; // Переменная объявляется до секции try, чтобы не ограничивать область видимости

        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch (IOException e) {
            System.out.println("Ошибка открытия-закрытия файла " + fileName + e);
        } finally { // Корректное закрытие потока
            if(inFile != null) {
                try {
                    inFile.close();
                } catch (IOException ignore) {
                    /*NOP*/
                }
            }
        }
    }
}
