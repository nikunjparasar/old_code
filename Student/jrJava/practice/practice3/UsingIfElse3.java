package jrJava.practice3;

import java.util.Scanner;

public class UsingIfElse3 {

	public static void main(String[] args) {
		
		double allowance;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's your current allowance? (Enter a decimal number)");
		allowance = scanner.nextDouble();

		// If the allowance id more than $20, we will deduct it by $10.
		// However, if the allowance is less or equal to $20, we will give $10 more.
		
		// What will happen if we use two separate and independent if-blocks?
		
		if(allowance>20) {
			allowance -= 10.0;
		}
		
		if(allowance<=20) {
			allowance += 10.0;
		}
		
		// It is dangerous. Both if-blocks can be executed.
		// For example, the allowance is 22, first block will get executed.
		// (Inside the first block, the value of allowance get changed.)
		// Because of the changed value of allowance, the second if-block will also get executed.
		
		
		System.out.println("Your allowance has become $" + allowance + ".");
	}

}







