package lr7.sr2;

public class Main2 {
    public static void main(String[] args) {

        SuperClassTest2 superObj = new SuperClassTest2("передал в конструктор суперкласса");
        String str = superObj.getVarStr();
        System.out.println(str);
        superObj.setVar("изменил в методе суперкласса");
        str = superObj.getVarStr();
        System.out.println(str + "\n");

        SubClass2 subObj = new SubClass2("передал в конструктор подкласса", 10);
        str = subObj.getVarStr();
        int numb = subObj.getVarInt();
        System.out.println(str + " " + numb);
        subObj.setVar("изменил оба поля в методе подкласса", 50);
        str = subObj.getVarStr();
        numb = subObj.getVarInt();
        System.out.println(str + " " + numb);

    }
}
