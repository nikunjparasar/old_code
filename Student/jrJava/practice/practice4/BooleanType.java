package jrJava.practice4;

import java.util.Scanner;

public class BooleanType {

	public static void main(String[] args) {
		
		// boolean type variable (storage space) can hold only true/false logical data.
		//boolean aaa;
		//aaa = true;
		//System.out.println("aaa is " + aaa);
		
		//boolean aaa = true; // both declaration and initialization in one statement.

		int money;
		boolean isRich;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many dollars do you have in your pocket? Enter an integer.");
		money = scanner.nextInt();
		
		isRich = money>=100;
		
		System.out.println("Our verdict: Do we think you are rich? Answer is " + isRich + ".");
	}

}
