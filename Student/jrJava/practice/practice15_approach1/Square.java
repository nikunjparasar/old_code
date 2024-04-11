package jrJava.practice15_approach1;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;

public class Square {
public static void draw(DrawingBoard board, Color color, int x, int y, int side) {
		
		Graphics g = board.getCanvas();
		g.setColor(color);
		g.drawRect(x, y, side, side);
		board.repaint();
	}
	
}
