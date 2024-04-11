package jrJava.practice3;

import java.util.Scanner;

public class UsingIfElse2 {

	// COMPARE THIS WITH the previous "UsingIfElse1.java".
	
	// It appears to be same as the previous "UsingIfElse1.java".
	// (Actually, it will do the same thing.)
	// But, there is a subtle difference. 
	
	public static void main(String[] args) {

		int age;
		double allowance = 20.0;;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How old are you? (Enter an integer.)");
		age = scanner.nextInt();
		
		// If they are older than or equal to 14, will increase the allowance by $10.
		// But, if they are younger than 14, we will decrease by $10.
				
		// What will happen if we use if-else blocks?
		if(age>=14) {
			allowance += 10.0; // allowance = allowance + 10.0;
			System.out.println("You are lucky. You got $10 more.");
		}
		else { // If the first one is true, it will not even come here.
			allowance -= 10.0; // allowance = allowance - 10.0;
			System.out.println("Too bad. You will get $10 less.");
		}
		
		System.out.println("Your allowance is $" + allowance + ".");

	}

}




