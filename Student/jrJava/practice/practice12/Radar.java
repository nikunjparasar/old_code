package jrJava.practice12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;

import resources.DrawingBoard;
import resources.Timer;

public class Radar {

	// This method will show one revolution of radar screen.
	public static void displayRadar(DrawingBoard board, int radius, int xC, int yC) {
		Graphics g = board.getCanvas();
		Timer timer = new Timer();
		
		int i;
		for(i=1; i<=360; i++) {
			board.clear();
			drawGradientArc(g, radius, xC, yC, i);
			g.setColor(Color.DARK_GRAY);
			g.drawOval(xC-radius, yC-radius, 2*radius, 2*radius);
			board.repaint();
			
			if(i==90 || i==270) {
				Toolkit.getDefaultToolkit().beep();
			}
			
			timer.pause(10);
		}
	}
	
	 
	
	public static void drawGradientArc(Graphics g, int radius, int xC, int yC, int leadingAngle) {
		// It will prepare a sector of 40 degree. (angle span = 40)
		// show total 40 shades of green color gradient.
		
		int startAngle = leadingAngle;
		int angleSpan = 40;
		Color color;
		int colorChange = 255/40;
		
		int i;
		for(i=1; i<=40; i++) {
			startAngle++;
			angleSpan--;
			
			color = new Color(255-colorChange*i, 255, 255-colorChange*i); 
			g.setColor(color);
			g.fillArc(xC-radius, yC-radius, 2*radius, 2*radius, startAngle, angleSpan);
		}
	}
	
}







