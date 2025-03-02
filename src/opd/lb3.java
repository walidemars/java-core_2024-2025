package opd;

import java.util.Scanner;

public class lb3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ввод данных
        System.out.println("Введите запланированный бюджет: ");
        double ZB = in.nextInt();
        System.out.println("Запланированный срок выполнения: ");
        double ZSV = in.nextInt();
        //System.out.println("Введите время проверки: ");
        //double VP = in.nextInt();
        System.out.println("Введите степень готовности проекта на 1 месяц в %: ");
        double SG = in.nextInt();
        System.out.println("Введите расходы за 1 месяц: ");
        double R = in.nextInt();

        // Расчеты
        double OOP = (ZB * SG) / 100;
        double FSV = ZB / OOP;
        double ZS = FSV - ZSV;

        double FR = R * FSV;
        double PB = FR - ZB;

        // Вывод результатов
        System.out.println("Задержка сроков равна: " + ZS);
        System.out.println("Перерасход бюджета равен: " + PB);

        in.close();
    }
}
