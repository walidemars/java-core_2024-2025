package lr7.sr3;

public class SuperClassTest3 {
    public int numb;

    public SuperClassTest3(int numb) {
        this.numb = numb;
    }

    public void setVar(int numb) {
        this.numb = numb;
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = " Class name: " + this.getClass().getSimpleName() + "\n" +
                " numb = " + numb;

        return superClassNameAndFieldValue;
    }
}
