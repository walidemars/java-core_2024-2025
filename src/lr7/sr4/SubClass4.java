package lr7.sr4;

import lr7.sr3.SubSubClass;

public class SubClass4 extends SuperClass4 {
    public String str;

    public SubClass4(char ch, String str) {
        super(ch);
        this.str = str;
    }

    public SubClass4(SubClass4 anotherClass) {
        super(anotherClass);
        this.str = anotherClass.str;
    }
}
