package lr5.sr2;

import lr5.sr1.Symbol;

public class test {
    public static void main(String[] args) {

        System.out.println("Введите первый символ");
        Symbol a = new Symbol();
        a.setSymbol();

        System.out.println("Введите второй символ");
        Symbol b = new Symbol();
        b.setSymbol();

        ArrSymbols arr = new ArrSymbols();

        arr.a = (char) a.getCodeSymbol();
        arr.b = (char) b.getCodeSymbol();


        System.out.println("Вывод полученного массива:");
        char[] charArr = arr.getArrChars();
        System.out.println(charArr);
    }
}
