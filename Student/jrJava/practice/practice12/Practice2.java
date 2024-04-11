package jrJava.practice12;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		
		//System.out.println(calculateSumForUser());
		double total = calculateSumForUser() + calculateSumForUser();
		System.out.println(total);
	}
  
	
	public static double calculateSumForUser(){
		
		Scanner scanner = new Scanner(System.in);
		double sum = 0.0;
		double entered = 0.0;
		
		while(entered>=0) {
			sum += entered;
			System.out.println("Enter a number (To stop, enter '-1').");
			entered = scanner.nextDouble();
		}
		
		System.out.println("sum = " + sum);
		return sum;
	}
	
	
}











