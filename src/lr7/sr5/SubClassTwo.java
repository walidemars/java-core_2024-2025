package lr7.sr5;

public class SubClassTwo extends SuperClass5 {
    protected char ch;

    public SubClassTwo(String str, char ch) {
        super(str);
        this.ch = ch;
    }

    public void ShowClassNameAndField() {
        System.out.println(
                "Class name: " + this.getClass().getSimpleName() +
                        "\nField string value: " + super.getStr() +
                        "\nField char value: " + this.ch);
    }
}
