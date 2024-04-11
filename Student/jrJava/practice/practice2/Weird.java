package jrJava.practice2;

public class Weird {

	public static void main(String[] args) {
		
		int x1 = 5;
		int x2 = 6;
		
		
		double average1 = (x1 + x2)/2; // That's weird. How come it becomes 5.0, instead of 5.5?
		System.out.println("avearge1 = " + average1);

		double average2 = (x1 + x2)/2.0; // This time, we are dividing by 2.0, not 2.
		System.out.println("avearge2 = " + average2);
		
		// We will talk about this in a couple of weeks. Super important topic!
		// But, for now, we will remember this: if we do int-int operation, like int/int, the result will be also an integer.
		// But, if we do int-double operation, like int/double, the result becomes double. 
	}

}
