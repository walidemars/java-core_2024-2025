package timus;

import java.util.Scanner;

public class task1820 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Введите количество заказанных бифштексов:");
		int n = in.nextInt();

		System.out.println("Введите сколько бифштексов вмещает сковородка:");
		int k = in.nextInt();
		int minTime;

		if (k >= n) minTime = 2;
		else {
			minTime = (int) Math.ceil((double) (n * 2) / k);
		}

		System.out.println("Минимальное количество минут для жарки: " + minTime);

		in.close();
	}

}
