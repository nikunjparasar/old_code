package jrJava.practice14_fields;

public class BBB {
	
	public static int abc;
	public static double pqrs;
	
	public static void mA(int aa, int bb) {
		abc = aa;
		int x = abc*bb;
		pqrs = (aa +bb)/2.0;
	}
	
	public static void mB(double aa) {
		abc++;
		pqrs = abc + aa;
		
	}
	
	public static void mC() {
		System.out.println(abc);
		System.out.println(pqrs);
		
	}
}
