package jrJava.practice4;

public class BooleanOperation {

	public static void main(String[] args) {
		
		// Precedence: !(NOT) > &&(AND) > ||(OR)
		
		int x = 3;
		boolean result1 = !(x<2) && !(x!=3) && x>2;
		System.out.println("reult1 = " + result1);

		boolean result2 = !(x<2 && x!=3 && x>2);
		System.out.println("reult2 = " + result2);
	}

}
 