package MyPack.Glava12.Perechislenia;

// Перечисление сортов яблок
// Использовать конструктор, переменную экземпляра и метод в перечислении
enum Apple {
    Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);

    private int price; // цена яблока каждого сорта

    // Конструктор
    Apple(int p) { price = p; }

    Apple() { price = -1; }

    int getPrice() { return price; }
}

class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

        ap = Apple.RedDel;

        // вывести значение перечисляемого типа
        System.out.println("Значение ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;
        //Сравнить два значения перечисляемого типа
        if(ap == Apple.GoldenDel)
            System.out.println("Переменная ар содержит GoldenDel\n");

        // Применить перечисление для управления оператором switch
        switch (ap) {
            case Jonathan:
                System.out.println("Сорт Jonathan красный");
                break;
            case GoldenDel:
                System.out.println("Сорт Golden Delicious желтый");
                break;
            case RedDel:
                System.out.println("Сорт Red Delicious красный");
                break;
            case Winesap:
                System.out.println("Сорт Winesap красный");
                break;
            case Cortland:
                System.out.println("Сорт Cortland красный");
                break;
        }
    }
}
