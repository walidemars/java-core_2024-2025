package lr7.sr5;

import lr7.sr4.SubClass4;

public class SubClassOne extends SuperClass5 {
    protected int numb;

    public SubClassOne(String str, int numb) {
        super(str);
        this.numb = numb;
    }


    public void ShowClassNameAndField() {
        System.out.println(
                "Class name: " + this.getClass().getSimpleName() +
                "\nField string value: " + super.getStr() +
                "\nField int value: " + this.numb);
    }


}
