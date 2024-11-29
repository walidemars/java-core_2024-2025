package lr5.sr4;

public class Test {
    public static void main(String[] args) {

        System.out.println("Передача символа и целого числа");
        Class4Zadanie test1 = new Class4Zadanie('A', 5);
        System.out.println(test1.symbol + " " + test1.number);

        System.out.println("Передача числа с плавающей точкой");
        Class4Zadanie test2 = new Class4Zadanie(65.1345);
        System.out.println(test2.symbol + " " + test2.number);


    }
}
