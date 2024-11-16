package timus;

import java.util.Scanner;

public class task2066 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Введите числа a, b, c: ");

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		int minimum = Math.min(a - b - c, a - b * c);

		System.out.println("Минимальное значение выражения: " + minimum);

		in.close();
	}

}
