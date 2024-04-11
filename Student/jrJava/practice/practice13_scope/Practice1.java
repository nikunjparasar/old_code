package jrJava.practice13_scope;

public class Practice1 {

	public static void main(String[] args) {
		
		int a = 10; // The scope of these 'a' and 'b' is inside the method block.
		boolean b = true;
		
		if(b) {
			double c = 0.1; // The scope of this 'c' is inside the if-block.
			System.out.println(a + ", " + b + ", " + c);
		}
		
		System.out.println(a + ", " + b); 
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int mA(int begin, int end, int increment) {
		int sum = 0;
		int cubic;
		int i;
		for(i=begin; i<=end; i+=increment) {
			//int cubic = i*i*i;
			cubic = i*i*i;
			sum += cubic;
		}
		return sum;	
	}
	// declaration statement in loops and outside are equa
	
	// thread stack area is very unstable
	
	
	public static int mB(int begin, int end, int increment) {
		int sum = 0;
		int cubic;
		
		for(int i=begin; i<=end; i+=increment) {
			cubic = i*i*i;
			sum += cubic;
		}
		
		//System.out.println(i); // cannot do this.
 		return sum;	
	}
	
	
}










