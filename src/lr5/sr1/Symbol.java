package lr5.sr1;

import java.util.Scanner;

public class Symbol {

    Scanner in = new Scanner(System.in);

    private char symbol;

    public void setSymbol () {
        System.out.println("Введите значение символа:");
        this.symbol = in.next().charAt(0);
    }

    public int getCodeSymbol() {
        return this.symbol;
    }

    public String getDesSymbol() {
        String des = String.valueOf(this.symbol);
        des = "Значение символа: " + des + "\nКод символа: " + getCodeSymbol();
        return des;
    }

}
