package lr7.sr2;

public class SubClass2 extends SuperClassTest2 {
    public int numb;

    public SubClass2(String str, int numb) {
        this.numb = numb;
        setVar(str);
    }

    public int getVarInt() {
        return numb;
    }

    public void setVar() {
    }

    public void setVar(int numb) {
        this.numb = numb;
    }

    public void setVar(String str) {
        super.setVar(str);
    }

    public void setVar(String str, int numb) {
        setVar(str);
        this.numb = numb;
    }

}
