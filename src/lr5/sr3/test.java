package lr5.sr3;

public class test {
    public static void main(String[] args) {

        System.out.println("передача двух аргументов");
        ClassWithConstructor test1 = new ClassWithConstructor(1, 2);
        System.out.println(test1.intA + " " + test1.intB);

        System.out.println("передача одного аргумента");
        ClassWithConstructor test2 = new ClassWithConstructor(1);
        System.out.println(test2.intA + " " + test2.intB);

        System.out.println("без передачи аргументов");
        ClassWithConstructor test3 = new ClassWithConstructor();
        System.out.println(test3.intA + " " + test3.intB);
    }
}
