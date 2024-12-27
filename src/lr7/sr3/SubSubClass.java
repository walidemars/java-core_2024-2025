package lr7.sr3;

public class SubSubClass extends SubClassTest3 {

    public String str;

    public SubSubClass(char ch, int numb, String str) {
        super(ch, numb);
        this.str = str;
    }

    public void setVar(char ch, int numb, String str) {
        super.ch = ch;
        super.numb = numb;
        this.str = str;
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = " Class name: " + this.getClass().getSimpleName() + "\n" +
                " numb = " + numb + "\n" + " char = " + ch + "\n" + " string = " + str;

        return superClassNameAndFieldValue;
    }
}
