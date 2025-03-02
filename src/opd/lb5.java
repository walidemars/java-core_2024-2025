package opd;

import java.util.Scanner;

public class lb5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод входных параметров
        System.out.print("Введите количество пользовательских экранов (KUI): ");
        int KUI = scanner.nextInt(); // Получаем количество пользовательских экранов от пользователя
        System.out.print("Введите количество обработчиков событий (KAct): ");
        int KAct = scanner.nextInt(); // Получаем количество обработчиков событий от пользователя
        System.out.print("Введите количество новых бизнес-объектов (KBO): ");
        int KBO = scanner.nextInt(); // Получаем количество новых бизнес-объектов от пользователя
        System.out.print("Введите количество новых бизнес-методов (KBM): ");
        int KBM = scanner.nextInt(); // Получаем количество новых бизнес-методов от пользователя

        // Оценки трудозатрат
        // Для каждого элемента определяются минимальные, наиболее вероятные и максимальные трудозатраты
        int OUI = 2, MUI = 4, PUI = 20; // Для экранов: O - минимальные, M - наиболее вероятные, P - максимальные
        int OAct = 4, MAct = 8, PAct = 32; // Для обработчиков
        int OBO = 2, MBO = 3, PBO = 8; // Для бизнес-объектов
        int OBM = 2, MBM = 6, PBM = 26; // Для бизнес-методов

        // Расчет средней трудоемкости и стандартного отклонения
        double EUI = calculateExpectedValue(OUI, MUI, PUI); // Расчет ожидаемой трудоемкости для экранов
        double EAct = calculateExpectedValue(OAct, MAct, PAct); // Расчет ожидаемой трудоемкости для обработчиков
        double EBO = calculateExpectedValue(OBO, MBO, PBO); // Расчет ожидаемой трудоемкости для бизнес-объектов
        double EBM = calculateExpectedValue(OBM, MBM, PBM); // Расчет ожидаемой трудоемкости для бизнес-методов

        double SKOUI = calculateStandardDeviation(OUI, PUI); // Расчет стандартного отклонения для экранов
        double SKOAct = calculateStandardDeviation(OAct, PAct); // Расчет стандартного отклонения для обработчиков
        double SKOBO = calculateStandardDeviation(OBO, PBO); // Расчет стандартного отклонения для бизнес-объектов
        double SKOBM = calculateStandardDeviation(OBM, PBM); // Расчет стандартного отклонения для бизнес-методов

        // Суммарная трудоемкость
        double E = KUI * EUI + KAct * EAct + KBO * EBO + KBM * EBM; // Общая трудоемкость проекта в человеко-часах
        double SKO = Math.sqrt(Math.pow(SKOUI * KUI, 2) + Math.pow(SKOAct * KAct, 2) +
                Math.pow(SKOBO * KBO, 2) + Math.pow(SKOBM * KBM, 2)); // Общее стандартное отклонение

        double E95 = E + 2 * SKO; // Ожидаемая трудоемкость с учетом 95% вероятности

        // Относительная погрешность
        double delta = (SKO / E) * 100; // Расчет относительной погрешности в процентах

        // Общая трудоемкость
        double EΣ = 4 * E95; // Общая трудоемкость с учетом 95% вероятности

        // Перевод в человеко-месяцы
        double Nch_m = EΣ / 132; // Перевод общей трудоемкости в человеко-месяцы (132 - среднее количество рабочих часов в месяц)

        // Оптимальная продолжительность
        double T = 2.5 * Math.pow(Nch_m, 1.0 / 3.0); // Оптимальная продолжительность проекта

        // Средняя численность команды
        double K = Nch_m / T; // Средняя численность команды для выполнения проекта

        // Вывод результатов
        System.out.printf("Суммарная трудоемкость (E): %.2f человеко-часов%n", E);
        System.out.printf("СКО: %.2f часов%n", SKO);
        System.out.printf("E95%%: %.2f человеко-часов%n", E95);
        System.out.printf("Относительная погрешность (Δ): %.2f%%%n", delta);
        System.out.printf("Общая трудоемкость (EΣ): %.2f человеко-часов%n", EΣ);
        System.out.printf("Трудоемкость в человеко-месяцах (N ч.*м.): %.2f человеко-месяцев%n", Nch_m);
        System.out.printf("Оптимальная продолжительность проекта (T): %.2f месяцев%n", T);
        System.out.printf("Средняя численность команды (K): %.2f человек(а)%n", K);
    }

    // Метод для расчета ожидаемой трудоемкости
    private static double calculateExpectedValue(int O, int M, int P) {
        return (P + 4 * M + O) / 6.0; // Формула для расчета ожидаемой трудоемкости (метод ПERT)
    }

    // Метод для расчета стандартного отклонения
    private static double calculateStandardDeviation(int O, int P) {
        return (P - O) / 6.0; // Формула для расчета стандартного отклонения
    }
}

