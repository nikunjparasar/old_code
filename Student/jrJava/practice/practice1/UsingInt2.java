package jrJava.practice1;

public class UsingInt2 {

	public static void main(String[] args) {
		
		// initialize: act of assigning for the first time.
		
		int priceOfPen = 6; // declaration and initialization in one statement.
		int numberOfPens = 12;
		
		int priceOfPencil;
		int numberOfPencils;
		
		priceOfPencil = 2; // first time this variable gets a value --> initialization.
		numberOfPencils = 15;
		
		priceOfPen = 7; // not an initialization.
		
		int totalCost;
		totalCost = priceOfPen*numberOfPens + priceOfPencil*numberOfPencils;
		
		System.out.println("Total cost is $" + totalCost + ".");

	}

}
