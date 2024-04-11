package jrJava.practice1;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {
		
		// We will prompt "Type in your money in integer" on the consle.
		// As the user types in an integer number, we will use "Scanner" to grab it.
		
		int value1;
		int value2;
		
		Scanner scanner = new Scanner(System.in); // We created something that can scan signal coming from keyboard.
		
		System.out.println("Type in your money in integer");
		
		value1 = scanner.nextInt(); // it will wait, wait, and wait till an integer comes in. Then, it will grab it.
		value2 = value1*10;
		
		System.out.println("Now, you have $" + value2 + "."); 
	}

}
