package MyPack.Glava12;

import java.lang.annotation.*;
import java.lang.reflect.*;

// Объявление типа аннотации
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

public class Meta {
    // аннотировать метод
    // у метода myMeth() теперь имеются два аргумента
    @MyAnno(str = "Пример аннотации", val = 100)
    public static void myMeth(String str, int i) {
        Meta ob = new Meta();

        // получить аннотацию из метода
        // и вывести значения ее членов
        try {
            // сначала получить объект типа Class,
            // представляющий данный класс
            Class<?> c = ob.getClass();

            // затем получить объект типа Method,
            // представляющий данный метод
            Method m = c.getMethod("myMeth", String.class, int.class);

            // далее получить аннотацию для данного класса
            MyAnno anno = m.getAnnotation(MyAnno.class);

            // и наконец, вывести значения членов аннотации
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth("Test", 10);
    }
}
