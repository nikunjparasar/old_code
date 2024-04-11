package jrJava.practice11;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;

public class GraphicsMethods {

	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(200, 0, 700, 700);
		Graphics g = board.getCanvas();
		
		board.clear();
		drawBlackHole(g, 150,   0,   0, 270, 220, 100); 
		drawBlackHole(g, 100, 200,   0,  90, 150,  80); 
		drawBlackHole(g,   0, 100, 220, 380, 400,  90); 
		board.repaint();
	}

	
	public static void drawBlackHole(Graphics g, int red, int green, int blue, int xC, int yC, int radius) {
		
		int i; // changing radius
		for(i=radius; i>=0; i--) {
			Color color = new Color(red*i/radius, green*i/radius, blue*i/radius);
			g.setColor(color);
			g.fillOval(xC-i, yC-i, 2*i, 2*i); 
		}
		
		return; // optional
	}
	
}






