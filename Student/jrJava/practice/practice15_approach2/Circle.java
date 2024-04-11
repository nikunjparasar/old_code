package jrJava.practice15_approach2;

import java.awt.Graphics;
import java.awt.Color;
import resources.DrawingBoard;

public class Circle {

	public static DrawingBoard board;
	public static Color color;
	public static int x, y, radius;
	public static int dx,dy;
	

	public static void draw() {
			
			Graphics g = board.getCanvas();
			g.setColor(color);
			g.drawOval(x-radius, y-radius, 2*radius, 2*radius);
			board.repaint();
		}
	
	public static void move() {
		x += dx;
		y += dy;
	}
	
}
