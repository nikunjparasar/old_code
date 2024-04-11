package jrJava.practice15_approach2;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;

public class Square {

	public static DrawingBoard board;
	public static Color color;
	public static int x, y, side;
	public static int dx,dy;
	
	public static void draw() {
			
			Graphics g = board.getCanvas();
			g.setColor(color);
			g.drawRect(x, y, side, side);
			board.repaint();
	}
	public static void move() {
		x += dx;
		y += dy;
	}
}
