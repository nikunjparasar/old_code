package jrJava.practice15_approach3;

import java.awt.Color;
import resources.DrawingBoard;
import resources.Timer;

public class Painter {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawingBoard board = new DrawingBoard(200, 0 , 600,600);
				
		Circle c1 = new Circle(board, Color.RED, 150, 200, 120, 5, 3);
		Circle c2 = new Circle(board, Color.GREEN, 400, 300, 70, 2, -2);
		Circle c3 = new Circle(board, Color.BLUE,600, 300, 150, -7, 2);
		
		Square s1 = new Square(board, Color.ORANGE, 200, 320, 50, 3, 7);
		Square s2 = new Square(board, Color.CYAN, 350, 100, 100, 6, -7);
		
		for (int i = 1; i<=20; i++) {
			c1.draw();
			c1.move();
			c2.draw();
			c2.move();
			c3.draw();
			c3.move();
			s1.draw();
			s1.move();
			s2.draw();
			s2.move();
		}
	}

}
