package lr6.sr1;

public class Test1 {
    public static void main(String[] args) {

        System.out.println("Присваивание символа");
        ClassZadanie1 ch = new ClassZadanie1('A');
        System.out.print("Символьное поле равно: ");
        System.out.println(ch.getValueChar());
        System.out.print("Текстовое поле равно: ");
        System.out.println(ch.getValueString());

        System.out.println();

        System.out.println("Присваивание строки");
        ClassZadanie1 str = new ClassZadanie1("abcd");
        System.out.print("Символьное поле равно: ");
        System.out.println(str.getValueChar());
        System.out.print("Текстовое поле равно: ");
        System.out.println(str.getValueString());

        System.out.println();

        System.out.println("Присваивание символьного массива с одним элементом");
        char[] arrCh1 = {'a'};
        ClassZadanie1 arr1 = new ClassZadanie1(arrCh1);
        System.out.print("Символьное поле равно: ");
        System.out.println(arr1.getValueChar());
        System.out.print("Текстовое поле равно: ");
        System.out.println(arr1.getValueString());

        System.out.println();

        System.out.println("Присваивание символьного массива с несколькими элементами");
        char[] arrCh2 = {'a', 'b', 'c', 'd'};
        ClassZadanie1 arr2 = new ClassZadanie1(arrCh2);
        System.out.print("Символьное поле равно: ");
        System.out.println(arr2.getValueChar());
        System.out.print("Текстовое поле равно: ");
        System.out.println(arr2.getValueString());
    }
}
