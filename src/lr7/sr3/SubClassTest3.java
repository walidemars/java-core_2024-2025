package lr7.sr3;

public class SubClassTest3 extends SuperClassTest3 {

    public char ch;

    public SubClassTest3(char ch, int numb) {
        super(numb);
        this.ch = ch;
    }

    public void setVar(int numb, char ch) {
        this.ch = ch;
        super.setVar(numb);
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = " Class name: " + this.getClass().getSimpleName() + "\n" +
                " numb = " + numb + "\n" + " char = " + ch;

        return superClassNameAndFieldValue;
    }
}
