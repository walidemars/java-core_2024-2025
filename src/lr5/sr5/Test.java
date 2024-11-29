package lr5.sr5;

public class Test {
    public static void main(String[] args) {

        Class5zadanie number = new Class5zadanie(5);
        System.out.println("Значение поля после объявления переменной: " + number.getNumber());

        number.setNumber();
        System.out.println("Значение поля при вызове метода без аргумента: " + number.getNumber());

        number.setNumber(9);
        System.out.println("Значение поля при вызове метода с аргументом меньше 100: " + number.getNumber());

        number.setNumber(101);
        System.out.println("Значение поля при вызове метода с аргументом больше 100: " + number.getNumber());
    }
}
