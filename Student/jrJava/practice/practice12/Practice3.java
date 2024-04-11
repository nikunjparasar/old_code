package jrJava.practice12;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;
import resources.Timer;

public class Practice3 {

	public static void main(String[] args) {
		DrawingBoard board = new DrawingBoard(200, 0, 600, 600);
		Timer timer = new Timer();
		
		moveBall(board, timer, Color.GREEN, 80,   0,   0, 600, 600);
		moveBall(board, timer, Color.GREEN, 80, 600, 600, -50, 300);
		moveBall(board, timer, Color.GREEN, 80, -50, 300, 400, -50);
		moveBall(board, timer, Color.GREEN, 80, 400, -50, 300, 300);
	}

	 
	
	public static void moveBall(DrawingBoard board, Timer timer, Color color, 
			                    int radius, int x1, int y1, int x2, int y2) {
		Graphics g = board.getCanvas();
		int xC, yC; // changing center coordinate
		
		int i;
		for(i=1; i<=100; i++) {
			xC = x1 + (x2-x1)*i/100; // should not do "(x2-x1)/100*i".
			yC = y1 + (y2-y1)*i/100;
			
			board.clear();
			g.setColor(color);
			g.fillOval(xC-radius, yC-radius, 2*radius, 2*radius);
			board.repaint();
			timer.pause(10);
		}
		
	}
	
}





