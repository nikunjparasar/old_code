package jrJava.practice12;

public class Practice6 {

	public static void main(String[] args) {
		//sum(2, 4);
	}

	
	public static double sum(double v1, double v2) {
		System.out.println("double. double");
		return v1 + v2;
	}
	
	public static double sum(int v1, double v2) {
		System.out.println("int, double");
		return v1 + v2;
	}
	
	public static double sum(double v1, int v2) {
		System.out.println("double, int");
		return v1 + v2;
	}
	
	//public static double sum(int v1, int v2) {
	//	System.out.println("int, int");
	//	return v1 + v2;
	//}
	
}
