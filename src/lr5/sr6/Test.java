package lr5.sr6;

public class Test {
    public static void main(String[] args) {

        Class6zadanie maxmin = new Class6zadanie(18);
        System.out.println("Передача 1го аргумента конструктору:");
        maxmin.showMaxMin();

        maxmin = new Class6zadanie(15, 23);
        System.out.println("Передача 2х аргументов конструктору:");
        maxmin.showMaxMin();

        maxmin.setMaxMin(10);
        System.out.println("Передача 1го аргумента методу:");
        maxmin.showMaxMin();

        maxmin.setMaxMin(11, 30);
        System.out.println("Передача 2х аргументов методу:");
        maxmin.showMaxMin();
    }
}
