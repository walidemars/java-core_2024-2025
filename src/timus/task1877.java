package timus;

import java.util.Scanner;

public class task1877 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String kode1 = in.nextLine();
		String kode2 = in.nextLine();
		
		int k1 = Integer.parseInt(kode1);
		int k2 = Integer.parseInt(kode2);
		
		int vor = 0;
			
		for (int day = 1; day < 10000; day++, vor++) {		
			
			if (day % 2 == 0) {
				if (vor == k2) {
					System.out.println("yes");
					break;
				}
			}
			else if (day % 2 != 0) {
				if (vor == k1) {
					System.out.println("yes");
					break;
				}
			}	
		} 
		if (vor != k1 && vor != k2)
			System.out.println("no");

		in.close(); 
	}

}
