package lr4;

import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования");
        String text = in.nextLine();

        System.out.println("Введите ключ");
        int shift = in.nextInt();

        System.out.println("Текст после преобразования:");
        String encryptText = getEncryptString(text, shift);
        System.out.println(encryptText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String yORn = in.nextLine();

        while (true) {
            yORn = in.nextLine();
            if (yORn.equals("y")) {
                System.out.println(getDecryptString(encryptText, shift));
                break;
            }
            else if (yORn.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректное значение");

            }
        }
    }

    public static String getEncryptString(String encryptString, int shift) {

        char[] arrayChar = encryptString.toCharArray();

        long[] arrayInt = new long[arrayChar.length];

        char[] arrayCharNew = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {

            arrayInt[i] = arrayChar[i] + shift;

            arrayCharNew[i] = (char) arrayInt[i];
        }
        encryptString = new String(arrayCharNew);

        return encryptString;
    }

    public static String getDecryptString(String decryptString, int shift) {

        char[] arrayChar = decryptString.toCharArray();

        long[] arrayInt = new long[arrayChar.length];

        char[] arrayCharNew = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {

            arrayInt[i] = arrayChar[i] - shift;

            arrayCharNew[i] = (char) arrayInt[i];
        }
        decryptString = new String(arrayCharNew);

        return decryptString;
    }
}
