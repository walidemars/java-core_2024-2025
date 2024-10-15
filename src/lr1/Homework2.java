package lr1;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = in.nextLine();

        System.out.println("Enter age: ");
        int age = in.nextInt();

        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);

        in.close();
    }
}
