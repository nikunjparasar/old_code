package jrJava.multi_threading_5;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;

public class RotatingCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawingBoard board = new DrawingBoard(200, 0, 600,  600);
		Graphics g = board.getCanvas();
		ColorReader colorReader = new ColorReader();
		int radius = 1;
		int angle = 0;
		int arcSize = 30;	
		Color color;
		
		new Thread(colorReader).start();
		
		while(true) {
			angle += arcSize/2;
			
			if(radius<200) {
				radius++;
			}
			
			color = colorReader.getColor();
			

			board.clear();
			
			g.setColor(color);
			g.fillArc(300-radius,  300-radius,  2*radius,  2*radius, angle, arcSize);
			g.drawOval(300-radius, 300-radius, 2*radius,  2*radius);
			
			board.repaint();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
