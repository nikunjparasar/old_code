package jrJava.practice2;

import java.util.Scanner;

public class CostCalculator {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		
		double priceOfPen;
		int numberOfPens;
		double priceOfPencil;
		int numberOfPencils;
		
		double costOfPens, costOfPencils, totalCost; // we can declare variables in a same line as longas they are all same type.
		
		System.out.println("We will calculate your stationary cost.");
		
		System.out.println("What's the price of a pen? (type in as a decimal number)");
		priceOfPen = scanner.nextDouble(); // We expect the input to be a decimal number.
		
		System.out.println("How many pens are you buying? (type in as an integer number)");
		numberOfPens = scanner.nextInt(); // We expect the input to be an integer.
		
		System.out.println("What's the price of a pencil? (type in as a decimal number)");
		priceOfPencil = scanner.nextDouble(); // We expect the input to be a decimal number.
		
		System.out.println("How many pencils are you buying? (type in as an integer number)");
		numberOfPencils = scanner.nextInt(); // We expect the input to be an integer.

		costOfPens = priceOfPen*numberOfPens;
		costOfPencils = priceOfPencil*numberOfPencils;
		totalCost = costOfPens + costOfPencils;
		
		System.out.println("It will cost $" + costOfPens + " for pens and $" + costOfPencils + " for pencils.");
		System.out.println("So, it will cost you total $" + totalCost + ".");
	}

}












