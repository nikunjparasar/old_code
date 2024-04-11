package jrJava.practice3;

import java.util.Scanner;

public class UsingIfElse4 {

	// COMPARE THIS WITH THE PREVIOUS "UsingIfElse3.java".
	
	public static void main(String[] args) {
		
		double allowance;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's your current allowance? (Enter a decimal number)");
		allowance = scanner.nextDouble();

		// If the allowance id more than $20, we will deduct it by $10.
		// However, if the allowance is less or equal to $20, we will give $10 more.
		
		// What will happen if we use if-else blocks?
		
		if(allowance>20) {
			allowance -= 10.0;
		}
		else {
			allowance += 10.0;
		}
		
		// If we use the if-else blocks,
		// ONLY ONE of the two blocks will get executed and
		// at least one of the two blocks will get executed.
		
		System.out.println("Your allowance has become $" + allowance + ".");

	}

}



