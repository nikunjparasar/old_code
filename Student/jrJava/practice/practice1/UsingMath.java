package jrJava.practice1;

public class UsingMath {

	public static void main(String[] args) {
		
		int radius = 10;
		
		//double area = 3.1415*radius*radius;
		double area = Math.PI*radius*radius;
		//double volume = Math.PI*radius*radius*radius*4/3;
		double volume = Math.PI*Math.pow(radius, 3)*4/3;
		
		System.out.println("Area is " + area);
		System.out.println("Volume is " + volume);
		
		int x = 15;
		int y = 30;
		int difference = Math.abs(x - y);
		System.out.println("difference is " + difference);
		
		int value = 5;
		double squareRoot = Math.sqrt(value);
		System.out.println("Square root is " + squareRoot);
		
		
	}
 
}





