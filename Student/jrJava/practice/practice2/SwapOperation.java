package jrJava.practice2;

public class SwapOperation {

	public static void main(String[] args) {
		
		int value1 = 10;
		int value2 = 15;
		
		// If we do swapping like this, it will be wrong!
		// The moment we copy value1 into value2, the original value in value2 will be overwritten.
		// DO NOT MAKE THIS KIND OF MISTAKE!
		//value2 = value1;
		//value1 = value2;
		
		// The correct way is by using another storage space (we will call that as 'temp').
		int temp = value2; // Before it gets overwritten, we save it safely into the temp space.
		value2 = value1;
		value1 = temp;
		
		
		System.out.println("value1 = " + value1 + ",  value2 = " + value2);
		
	}

}
