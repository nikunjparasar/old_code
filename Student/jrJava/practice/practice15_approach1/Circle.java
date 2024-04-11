package jrJava.practice15_approach1;

import java.awt.Color;
import resources.DrawingBoard;
import java.awt.Graphics;
public class Circle {

	public static void draw(DrawingBoard board, Color color, int x, int y, int radius) {
		
		Graphics g = board.getCanvas();
		g.setColor(color);
		g.drawOval(x-radius, y-radius, 2*radius, 2*radius);
		board.repaint();
	}
}
