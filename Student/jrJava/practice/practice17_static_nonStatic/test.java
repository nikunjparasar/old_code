package jrJava.practice17_static_nonStatic;

import java.awt.Color;


import resources.DrawingBoard;

public class test {

	public static void main(String[] args) {
		DrawingBoard board = new DrawingBoard(200, 0, 600, 600);
		
		Circle c1 = new Circle(board, Color.RED, 150, 200, 5, 3);
		System.out.println(Circle.number);
		Circle c2 = new Circle(board, Color.GREEN, 400, 300, 2, -2);
		System.out.println(Circle.number);
		Circle c3 = new Circle(board, Color.BLUE,600, 300, -7, 2);
		System.out.println(Circle.number);
		Circle myCircle = new Circle();
		Circle yourCircle = new Circle();
		Circle hisCircle = new Circle();
		Circle herCircle = new Circle();
		System.out.println(Circle.number);
		
		
		Circle.radius = 100;
		
		for ( int i = 1; i<= 10; i++) {
			c1.draw();
			c1.move();
			c2.draw();
			c2.move();
			c3.draw();
			
		}
	}
}
