package lr4;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Создание алфавита
        char alphabet[] = new char[67];

        alphabet[0] = 'Ё';
        alphabet[alphabet.length - 2] = 'ё';
        alphabet[alphabet.length - 1] = ' ';

        char symbol = 1040;

        for (int i = 1; i < alphabet.length - 1; i++) {
            alphabet[i] = symbol;
            symbol++;
        }

        // Отображение алфавита
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
        System.out.println();

        System.out.println("Введите текст для шифрования");
        String text = in.nextLine();

        System.out.println("Введите ключ");
        int shift = in.nextInt();

        System.out.println("Текст после преобразования:");
        String encryptText = getEncryptString(text, shift, alphabet);
        System.out.println(encryptText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String yORn = in.nextLine();

        while (true) {
            yORn = in.nextLine();
            if (yORn.equals("y")) {
                System.out.println(getDecryptString(encryptText, shift, alphabet));
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

    public static String getEncryptString(String encryptString, int shift, char alphabet[]) {

        char[] arrayChar = encryptString.toCharArray();

        long[] arrayInt = new long[arrayChar.length];

        char[] arrayCharNew = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (arrayChar[i] == alphabet[j]) {
                    if (j + shift < alphabet.length) {
                        arrayInt[i] = alphabet[j + shift];
                        arrayCharNew[i] = (char) arrayInt[i];
                    }
                    else {
                        int ostatok = (j + shift) - alphabet.length;
                        arrayInt[i] = alphabet[0 + ostatok];
                        arrayCharNew[i] = (char) arrayInt[i];
                    }
                }
            }
        }
        encryptString = new String(arrayCharNew);

        return encryptString;
    }

    public static String getDecryptString(String decryptString, int shift, char alphabet[]) {

        char[] arrayChar = decryptString.toCharArray();

        long[] arrayInt = new long[arrayChar.length];

        char[] arrayCharNew = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (arrayChar[i] == alphabet[j]) {
                    if (j - shift > -1) {
                        arrayInt[i] = alphabet[j - shift];
                        arrayCharNew[i] = (char) arrayInt[i];
                    }
                    else {
                        int ostatok = (j - shift) * -1;
                        arrayInt[i] = alphabet[alphabet.length - ostatok];
                        arrayCharNew[i] = (char) arrayInt[i];
                    }
                }
            }
        }
        decryptString = new String(arrayCharNew);

        return decryptString;
    }
}
