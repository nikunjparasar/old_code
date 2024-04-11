package jrJava.practice5;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;

public class DrawingShapes {

	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(200, 50, 800, 600);
		Graphics g = board.getCanvas();

		board.clear();
		
		g.setColor(Color.BLUE);
		g.drawRect(50, 30, 150, 90);
		g.fillRect(50, 200, 110, 230);
		
		g.setColor(Color.RED); 
		g.drawOval(250, 100, 200, 100); 
		g.fillOval(250, 250, 200, 200);
		
		g.setColor(Color.GREEN);
		//g.drawArc(500, 100, 250, 250, 0, 90);
		g.drawArc(500, 100, 250, 250, -30, 120);
		g.fillArc(500, 300, 250, 250, -150, 300);
		
		g.setColor(Color.DARK_GRAY);
		g.drawString("Hi, there. I am Sir.", 500, 200);
		
		board.repaint();
	}

}









