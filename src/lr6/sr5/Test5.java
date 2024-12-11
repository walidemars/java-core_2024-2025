package lr6.sr5;

public class Test5 {
    public static void main(String[] args) {
        SumNumbers s = new SumNumbers();
        s.setNumb(6);

        System.out.println("Сумма квадратов числа " + s.getNumb() + " = " + s.calcSumN());
    }
}
