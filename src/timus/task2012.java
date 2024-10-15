package timus;

import java.util.Scanner;

public class task2012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int f = in.nextInt();

		if ((240 - (12 - f) * 45) >= 0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		in.close();
	}

}
