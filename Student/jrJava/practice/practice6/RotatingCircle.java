package jrJava.practice6;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;
import resources.Timer;

public class RotatingCircle {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(200, 50, 800, 600);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();

		int radius = 100;
		int startAngle = 10;
		
		int i;
		for(i=1; i<=200; i++){
			
			radius += 1;
			startAngle += 5;
			
			board.clear();
			g.setColor(Color.RED); 
			g.fillArc(400-radius, 300-radius, 2*radius, 2*radius, startAngle, 30);
			g.drawOval(400-radius, 300-radius, 2*radius, 2*radius); 
			board.repaint();
			timer.pause(40); 
		}

	}

}
