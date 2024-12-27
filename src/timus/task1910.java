package timus;

import java.util.Scanner;

public class task1910 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int wallSection = in.nextInt();
        int[] magicPowerInEachSection = new int[wallSection];

        System.out.println("Количество секций стены: " + wallSection);

        for(int i = 0; i < wallSection; i++) {
            magicPowerInEachSection[i] = in.nextInt();
            System.out.println("Сила магического поля секции " + (i+1) + ": " + magicPowerInEachSection[i]);
        }

        int max = 0;
        int temp;
        int maxPowerIndex = 0;

        for(int i = 1; i < wallSection - 1; i++) {
            temp = magicPowerInEachSection[i-1] + magicPowerInEachSection[i] + magicPowerInEachSection[i+1];
            if(temp > max) {
                max = temp;
                maxPowerIndex = i + 1;
            }
        }

        System.out.println(
                "Максимальная суммарная сила поля возле трёх подряд идущих секций стены: " + max
                + ". Номер средней из них: " + maxPowerIndex);

        in.close();
    }
}
