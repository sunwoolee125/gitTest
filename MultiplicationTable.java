package B0829;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// ±¸±¸´Ü
		Scanner sunwoo = new Scanner(System.in);
		
		int inputNumber = Integer.parseInt(sunwoo.nextLine());
		
		int i = 1;
		int temple = 0;
		while(i<10) {
			temple = inputNumber * i;
			System.out.println(temple);
			i++;
		}
		temple = 0;
	}

}
