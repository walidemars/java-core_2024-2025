package lr1;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter surname: ");
        String surname = in.nextLine();

        System.out.println("Enter name: ");
        String name = in.nextLine();

        System.out.println("Enter patronymic: ");
        String patronymic = in.nextLine();

        System.out.println("Hello " + surname + " " + name + " " + patronymic);

        in.close();
    }
}
