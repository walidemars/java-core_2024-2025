package lr2;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите число: ");
		int number = in.nextInt();
		int tousen = number / 1000;
		
		if (tousen > 0) {
			System.out.println("В введенном числе " + tousen + " тысяч");
		}
		else {
			System.out.println("Число меньше одной тысячи");
		}
		
		in.close();

	}

}
