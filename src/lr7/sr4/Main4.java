package lr7.sr4;

public class Main4 {
    public static void main(String[] args) {

        SuperClass4 supObj = new SuperClass4('G');
        System.out.println(
                "Передал символ конструктору суперкласса: " + supObj.ch);
        SuperClass4 supObj2 = new SuperClass4(supObj);
        System.out.println(
                "Скопировал объект через конструктор суперкласса: " + supObj2.ch + "\n");

        SubClass4 subObj = new SubClass4('G', "in sub class");
        System.out.println(
                "Передал символ и строку конструктору подкласса: " + subObj.ch + " " + subObj.str);
        SubClass4 subObj2 = new SubClass4(subObj);
        System.out.println(
                "Скопировал объект через конструктор подкласса: " + subObj2.ch + " "
                 + subObj2.str + "\n");

        SubSubClass4 subSObj = new SubSubClass4('G', "in sub class", 85);
        System.out.println(
                "Передал символ, строку и число конструктору под-подкласса: " + subSObj.ch + " "
                + subSObj.str + " " + subSObj.numb);
        SubSubClass4 subSObj2 = new SubSubClass4(subSObj);
        System.out.println(
                "Скопировал объект через конструктор под-подкласса: " + subSObj2.ch + " "
                + subSObj2.str + " " + subSObj2.numb);
    }
}
