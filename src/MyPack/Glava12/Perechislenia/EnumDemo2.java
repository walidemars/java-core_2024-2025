package MyPack.Glava12.Perechislenia;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;

        System.out.println("Константы перечислимого типа Apple");

        // Применить метод values()
        Apple allapples[] = Apple.values();
        for(Apple a : allapples)
            System.out.println(a);

        System.out.println();

        // Применить метод valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("Переменная ар содержит " + ap);
    }
}
