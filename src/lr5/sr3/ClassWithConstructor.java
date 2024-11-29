package lr5.sr3;

import java.util.Scanner;

public class ClassWithConstructor {

    Scanner in = new Scanner(System.in);

    int intA, intB;

    ClassWithConstructor(int a, int b){
        intA = a;
        intB = b;
    }

    ClassWithConstructor(int a){
        intA = a;
        intB = -1;
    }

    ClassWithConstructor(){
        intA = -1;
        intB = -1;
    }
}
