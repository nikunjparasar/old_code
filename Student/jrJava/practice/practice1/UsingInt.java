package Student.jrJava.practice.practice1;

public class UsingInt {

	// variable is 'storage space'.
	// '=' is an assignment operator;
	public static void main(String[] args) {
		
		// declaration statements --> want to make variable (storage space)
		int priceOfPen;
		int numberOfPens;
		int priceOfPencil;
		int numberOfPencils;
		
		// assignment statements --> we are storing data into the variable(storage space).
		priceOfPen = 6;
		numberOfPens = 12;
		priceOfPencil = 2;
		numberOfPencils = 15;
		
		int totalCost;
		
		// When Java sees a variable, it will fo to the variable, read its current value in there, and copy it.
		// However, if the variable shows up on the left hand side, we are putting something in that variable(storage space).
		totalCost = priceOfPen*numberOfPens + priceOfPencil*numberOfPencils;
		
		System.out.println("Total cost is $" + totalCost);
		
		// THe following are wrong!
		// 15 = priceOfPen;  --> only one variable name can show up on the left hand side of '='.
		// priceOfPen + priceOfPencil = 35;  --> only one variable name can show up on the left hand side of '='.
		
	}

}






