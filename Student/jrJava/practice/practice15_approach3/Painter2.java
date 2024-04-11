package jrJava.practice15_approach3;

import java.awt.Color;

import resources.DrawingBoard;

public class Painter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawingBoard board = new DrawingBoard(200, 0 , 600,600);
		
		Circle c1 = new Circle(board, Color.RED, 150, 200, 120, 5, 3);
		
		System.out.println("In the main( )method: "+ c1);
	}

}
