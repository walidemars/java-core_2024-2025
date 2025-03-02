package lr9;

import java.util.Scanner;

public class zadanie2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int numb = in.nextInt();

        ConvertIntToBinary(numb);
    }

    public static void ConvertIntToBinary(int n){

        int ostatok = n % 2;
        if (n / 2 == 1) {
            System.out.print(1);
        }
        else {
            ConvertIntToBinary(n / 2);
        }
        System.out.print(ostatok);
    }
}
