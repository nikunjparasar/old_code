package jrJava.imageManipulation3;

import java.awt.Color;

public class Test {

	public static void main(String[] args) {
		
		Circle c = new Circle(100, 100, 100, Color.RED, 5, 6);
		Square s = new Square(500, 500, 140, Color.BLUE, -7, -3);

		MyPanel panel = new MyPanel(200, 0, 800, 600);
		panel.setDrawingObjects(c, s); 
		
		for(int i=0; i<100; i++) {
			c.move();
			s.move();
			
			panel.repaint();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) { }
			
		}
		
	}

}










