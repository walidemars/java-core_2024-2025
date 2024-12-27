package lr7.sr3;

import lr7.sr2.SuperClassTest2;

public class Main3 {
    public static void main(String[] args) {

        SuperClassTest3 superObj = new SuperClassTest3(2);
        String toStr = superObj.toString();
        System.out.println(toStr + "\n");

        SubClassTest3 subObj = new SubClassTest3('a', 5);
        toStr = subObj.toString();
        System.out.println(toStr + "\n");

        SubSubClass subSObj = new SubSubClass('p', 4, "in sub sub class");
        toStr = subSObj.toString();
        System.out.println(toStr);
    }
}
