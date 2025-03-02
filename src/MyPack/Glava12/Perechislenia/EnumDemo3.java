package MyPack.Glava12.Perechislenia;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap;

        // Вывести цену на яблоко сорта Winesap
        System.out.println("Яблоко сорта Winesap cтоит " + Apple.Winesap.getPrice() + " центов\n");

        // Вывести цены на все сорта яблок
        System.out.println("Цены на все сорта яблок:");
        for(Apple a : Apple.values())
            System.out.println(a + " стоит " + a.getPrice() + " центов");
    }
}
