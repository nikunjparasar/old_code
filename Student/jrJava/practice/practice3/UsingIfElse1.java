package jrJava.practice3;

import java.util.Scanner;

public class UsingIfElse1 {

	public static void main(String[] args) {
		
		int age;
		double allowance = 20.0;;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How old are you? (Enter an integer.)");
		age = scanner.nextInt();
		
		// If they are older than or equal to 14, will increase the allowance by $10.
		// But, if they are younger than 14, we will decrease by $10.
		
		// What will happen if we use two independent if-blocks?
		if(age>=14) {
			allowance += 10.0; // allowance = allowance + 10.0;
			System.out.println("You are lucky. You got $10 more.");
		}
		
		// This is a separate and independent if-block. 
		if(age<14) {  // Even if the first one is true, this if-condition still has to be evaluated.
			allowance -= 10.0; // allowance = allowance - 10.0;
			System.out.println("Too bad. You will get $10 less.");
		}
		
		System.out.println("Your allowance is $" + allowance + ".");
	}

	
}








