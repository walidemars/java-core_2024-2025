package lr2;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите число: ");
		int number = in.nextInt();
		
		if (number % 3 == 0) {
			System.out.println("Число делится на 3");
		}
		else {
			System.out.println("Число не делится на 3");
		}
		
		in.close();

	}

}
