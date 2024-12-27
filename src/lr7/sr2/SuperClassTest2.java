package lr7.sr2;

public class SuperClassTest2 {
    // закрытое текстовое поле
    private String varstr;

    // конструктор с текстовым аргументом
    SuperClassTest2(String strEx) {
        this.varstr = strEx;
    }

    SuperClassTest2() {
    }

    // @Override - аннотация указываемая для того,
    // чтобы показать, что далее мы собираемся
    // переопределять метод суперкласса
    public int LenghtString() {
        return this.varstr.length();
    }

    public String getVarStr() {
        return varstr;
    }

    public void setVar(String str) {
        this.varstr = str;
    }
}
