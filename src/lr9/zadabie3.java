package lr9;

import java.util.Scanner;

public class zadabie3 {
    static Scanner in = new Scanner(System.in);
    static int i = 0;

    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");
        int arrayLength = in.nextInt();

        int[] arrayInt = new int[arrayLength];

        EnterArray(arrayInt);
        i = 0;
        ShowArray(arrayInt);

    }

    public static void EnterArray(int[] array){

        if (i < array.length){
            System.out.println("ВВедите элемент массива: ");
            array[i] = in.nextInt();
            i++;
            EnterArray(array);
        }
        else {
            return;
        }
    }

    public static void ShowArray(int[] array){
        if (i < array.length){
            System.out.println(array[i]);
            i++;
            ShowArray(array);
        }
        else {
            return;
        }
    }


}
