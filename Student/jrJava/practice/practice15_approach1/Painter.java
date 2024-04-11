package jrJava.practice15_approach1;

import java.awt.Color;

import resources.DrawingBoard;

public class Painter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DrawingBoard board = new DrawingBoard(200, 0, 600, 600);
		Color circleColor = Color.RED;
		int circleX = 300;
		int circleY = 100;
		int circleRadius = 80;
		int circleDx = 7;
		int circleDy = 3;
		
		Color squareColor = Color.BLUE;
		
		
		int squareX = 400;
		int squareY = 400;
		int squareSide = 140;
		int squareDx = -25;
		int squareDy = -10;
		
		Circle.draw(board, circleColor, circleX, circleY, circleRadius);
		Square.draw(board, squareColor, squareX, squareY, squareSide);
		
		for (int i = 0; i<10; i++) {
			circleX += circleDx;
			circleY += circleDy;
			Circle.draw(board, circleColor, circleX, circleY, circleRadius);
			
			squareX += squareDx;
			squareY += squareDy;
			Square.draw(board, squareColor, squareX, squareY, squareSide);
		
		}
		
	
	
	
	}
	
	

}
