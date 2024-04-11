package jrJava.typeConversion;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		short a1 = 67;
		byte a2 =(byte)a1;
		
		double a3 = 4.5;
		float a4 = (float)a3;
		int a5 = (int)a3;
		
		boolean b1 = false;
		//int b2 = (int)b1;
		
		char c1 = 's';
		int c2 = c1;
		c1 = (char)c2;
		char c3 = (char)59.5;
		
		double d1 = 3.1415;
		//float d2 = 3.1415;
		float d3 = (float)3.1415;
		float d4 = 3.1415F;
		
		//int e1 = (int)5.56+ 1.01;
		int e1 = (int)5.56+ (int)1.01;
		int e2 = (int) (5.56+ 1.01);
		
		
	}

}
