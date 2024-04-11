package jrJava.imageManipulation4;

import java.awt.Color;
import java.awt.Graphics;

public class Test {

	public static void main(String[] args) {
		
		Circle c = new Circle(100, 100, 250, Color.RED, 5, 4);
		Square s = new Square(500, 500, 100, Color.BLUE, -5, -4);
		
		MyDrawingBoard board = new MyDrawingBoard(200, 0, 800, 600);
		Graphics g = board.getBufferedG();
		
		for(int i=0; i<100; i++) {
			board.clear();
			c.move();
			s.move();
			c.draw(g);
			s.draw(g);
			board.repaint();
			
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) { }
		}
		
	}

}







