package jrJava.practice2;

import java.util.Scanner;

public class UsingIfElse {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);

		System.out.println("Type in an integer.");
		int quantity1 = scanner.nextInt();
		
		System.out.println("Type in another integer.");
		int quantity2 = scanner.nextInt();
		
		
		if(quantity1>quantity2) {
			System.out.println("First number is greater than the second number.");
		}
		else {
			System.out.println("First number is either equal or less than the second number.");
		}
		
		
		System.out.println("It is done!");
		
	}

}
