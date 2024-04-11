package jrJava.practice3;

import java.util.Scanner;

public class UsingNestingBlockStructure {

	public static void main(String[] args) {

		int x;
		int y;

		Scanner scanner = new Scanner(System.in);
		System.out.println("User! Think of a point in the x,y-coordinate system.");
		System.out.println("Enter its x coordinate value (as an integer).");
		x = scanner.nextInt();
		System.out.println("Enter its y coordinate value (as an integer).");
		y = scanner.nextInt();

		if(x>=0) {

			if(y>=0) {
				System.out.println("Your point is in Quadrant 1.");
			}
			else {
				System.out.println("Your point is in Quadrant 4.");
			}
		}
		else {

			if(y>=0) {
				System.out.println("Your point is in Quadrant 2.");
			}
			else {
				System.out.println("Your point is in Quadrant 3.");
			}
		}

	}

}




