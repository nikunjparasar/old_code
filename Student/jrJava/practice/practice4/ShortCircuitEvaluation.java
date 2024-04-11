package jrJava.practice4;

public class ShortCircuitEvaluation {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		boolean aaa = x>10 && (x<=20 || y!=10) && !(x+y>x-y);
		// When it evaluates the first condition, it will already
		// know that, regardless of the rest of them, it will be 'false'.
		// So, it will stop any further evaluation.
		
		if(x>10 && (x<=20 || y!=10) && !(x+y>x-y)) {
			// code
		}
		
		
		boolean bbb = x-y<0 || x==10 && y!=10 || aaa;
		// When it evaluates the first condition, it will already
		// know that, regardless of the rest of them, it will be 'true'.
		// So, it will stop any further evaluation.
		
		if(x-y<0 || x==10 && y!=10 || aaa) {
			// codes
		}
		
	}

}









