package jrJava.practice3;

import java.util.Scanner;

public class UsingElseIf {

	public static void main(String[] args) {
		
		int score;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What was your score of todays' math test? Enter an integer.");
		score = scanner.nextInt();
		
		// Let's see what kind of response parents will show.
		
		/*
		if(score>=95) {
			System.out.println("Excellent! We are very proud of you.");
		}
		if(score>=90) {
			System.out.println("Very good! You could do better. Perhaps, next time.");
		}
		if(score>=80) {
			System.out.println("Oh no! Do you need help?");
		}
		if(score>=70) {
			System.out.println("You brought shame to our family. We don't want to see your face.");
		}
		if(score>=60) {
			System.out.println("YOU #$%%@ ^&^%&^% STUPID %^%$ @##%.");
		}
		*/
		
		// The above will not work properly. We used several separate and independent if blocks.
		// Since they are independent, each if-condition will get evaluated regardless of previous blocks.
		// So, it is quite possible more than one block mat get executed.
		// That is wrong!
		
		// What we wanted was only one of the blocks get executed.
		// To do that, we need to use "else if-blocks'.
		
		if(score>=95) {
			System.out.println("Excellent! We are very proud of you.");
		}
		else if(score>=90) {
			System.out.println("Very good! You could do better. Perhaps, next time.");
		}
		else if(score>=80) {
			System.out.println("Oh no! Do you need help?");
		}
		else if(score>=70) {
			System.out.println("You brought shame to our family. We don't want to see your face.");
		}
		else { // else if(score>=60) {
			System.out.println("YOU #$%%@ ^&^%&^% STUPID %^%$ @##%.");
		}
		
		// By using else-if, we can make sure ONLY ONE block gets executed.
		
		// Also, if we make it end with else-block, it will make AT LEAST one of the blocks will get executed.
		
		
	}

}
