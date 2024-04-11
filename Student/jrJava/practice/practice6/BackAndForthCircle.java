package jrJava.practice6;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;
import resources.Timer;

public class BackAndForthCircle {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(200, 50, 800, 600);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();

		int x = 5;
		int change = 5;
		
		int i;
		for(i=1; i<=1000; i++){
			
			if(x<=0 || x>=700) {
				change = -change; // This will change the sign of the value
			}
			
			x = x + change; 
			
			board.clear();
			g.setColor(Color.BLUE);
			g.fillOval(x, 250, 100, 100);
			board.repaint();
			timer.pause(20); 
		}
		

	}

}
