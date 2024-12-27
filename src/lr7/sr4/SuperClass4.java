package lr7.sr4;

public class SuperClass4 {
    public char ch;

    public SuperClass4(char ch) {
        this.ch = ch;
    }

    public SuperClass4(SuperClass4 anotherClass) {
        this.ch = anotherClass.ch;
    }
}
