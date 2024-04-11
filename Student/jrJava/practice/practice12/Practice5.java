package jrJava.practice12;

public class Practice5 {

	// Method Overloading:
	
	public static void main(String[] args) {
		sum(1, 2);
	}

	
	public static int sum(int v1, int v2) {
		return v1 + v2;
	}
	
	//public static int sum(int v3, int v4) {
	//	return v3 + v4;
	//}
	
	//public static double sum(int v1, int v2) {
	//	return v1 + v2;
	//}
	
	
	public static double sum(int v1, double v2) {
		return v1 + v2;
	}
	
	
	public static int sum(int v1, int v2, int v3) {
		return v1 + v2 + v3;
	}
	
	
	public static double sum(double v1, double v2) {
		return v1 + v2;
	}
	
	
	public static double sum(double v1, double v2, double v3) {
		return v1 + v2 + v3;
	}
	
	
}










