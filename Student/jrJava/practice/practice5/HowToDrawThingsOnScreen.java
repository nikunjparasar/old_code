package jrJava.practice5;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;

public class HowToDrawThingsOnScreen {

	public static void main(String[] args) {
		
		// First, create a window (JFrame, JPanel: we will learn these later). 
		DrawingBoard board = new DrawingBoard(300, 100, 800, 500);
		
		// Second, we need to get the drawing surface (we will call it canvas) --> "board.getCanvas()"
		// It will give you the tool (Graphics g) you can use to draw on that surface.
		// Once you acquire, you can re-use this again and again.
		Graphics g = board.getCanvas();
		
		board.clear(); // Each time you call this, everything on the surface will be cleared.
		
		g.setColor(Color.CYAN); // You set a color. All drawings will use this color until you change the color.
		
		g.drawRect(100, 100, 300, 200);
		
		// If you are done drawing and you want to show what you did on the screen,
		// you call board.repaint();
		board.repaint();
		
	}

}
