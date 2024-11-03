package timus;

import java.util.Scanner;

public class task1787 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество машин успевающих повернуть в течении минуты");
        int k = in.nextInt();
        System.out.println("Введите количество минут прошедших с начала наблюдений");
        int n = in.nextInt();

        int vProbke = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Введите количество машин подъехавших к повороту");
            vProbke += in.nextInt();
            if (vProbke < k) vProbke = 0;
            else vProbke -= k;
        }

        System.out.println("Машин в пробке после " + n + " минут: " + vProbke);

        in.close();
    }
}

