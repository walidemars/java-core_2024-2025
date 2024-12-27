package lr7.sr4;

import lr7.sr3.SubSubClass;

public class SubSubClass4 extends SubClass4 {
    public int numb;

    public SubSubClass4(char ch, String str, int numb) {
        super(ch, str);
        this.numb = numb;
    }

    public SubSubClass4(SubSubClass4 anotherClass) {
        super(anotherClass);
        this.numb = anotherClass.numb;
    }
}
