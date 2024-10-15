package lr2;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите число: ");
		int number = in.nextInt();
		
		if ((number % 4 == 0) && (number > 9)) {
			System.out.println("Число удовлетворяет критериям");
		}
		else {
			System.out.println("Число не удовлетворяет критериям");
		}
		
		in.close();

	}

}
