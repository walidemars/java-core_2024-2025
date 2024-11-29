package lr5.sr4;

public class Class4Zadanie {
    char symbol;
    int number;

    Class4Zadanie(char s, int n) {
        symbol = s;
        number = n;
    }

    Class4Zadanie(double d) {
        symbol = (char) Math.floor(d);
        number = (int) ((d - Math.floor(d)) * 100);
    }
}
