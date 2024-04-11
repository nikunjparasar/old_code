package jrJava.practice1;

public class UsingDouble {

	public static void main(String[] args) {
		
		// If we need a decimal number to be stored, 
		// we need to specify it as 'double' type when we declare the variable(storage space).
		double priceOfPen;
		int numberOfPens;
		double priceOfPencil;
		int numberOfPencils;
		
		priceOfPen = 6.5;
		numberOfPens = 5;
		priceOfPencil = 2.75;
		numberOfPencils = 4;
		
		double totalCost;
		totalCost = priceOfPen*numberOfPens + priceOfPencil*numberOfPencils;
		
		System.out.println("Total cost is $" + totalCost + ".");
		
	}

}
