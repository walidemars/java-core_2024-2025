package lr5.sr2;

public class ArrSymbols {
    char a;
    char b;

    public char[] getArrChars() {
        char max = (char) Math.max(a, b);
        char min = (char) Math.min(a, b);

        char[] arrC = new char[(max - min) + 1];

        for (int i = 0;min <= max; min++, i++) {
            arrC[i] = min;
            System.out.println(min);
        }
        return arrC;
    }
}
