package jrJava.barbarianAttack1;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Iterator;

import resources.DrawingBoard;

public class Coordinator {
	
	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(0, 0, 1200, 800);
		Graphics2D g = (Graphics2D) board.getCanvas();
		
		Bow bow = new Bow(1000, 500, 0.4, 0.0);

		board.addMouseListener(bow);
		board.addMouseMotionListener(bow); 
		
		while(true) {
			board.clear();
			
			ArrowManager.move();
			
			bow.draw(g);
			ArrowManager.draw(g);
			board.repaint();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) { }
		}
		
	}

}





