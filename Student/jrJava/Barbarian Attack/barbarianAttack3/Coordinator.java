package jrJava.barbarianAttack3;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Iterator;

import resources.DrawingBoard;

public class Coordinator {
	
	public static final String R_PATH = "jrJava/barbarianAttack_imagesAndSounds/";
	public static boolean gameOver;
	
	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(0, 0, 1350, 700);
		Graphics2D g = (Graphics2D) board.getCanvas();
		
		Bow bow = new Bow(1163, 523, 0.3, 0.0);

		board.addMouseListener(bow);
		board.addMouseMotionListener(bow); 
		
		board.setBackgroundImage(R_PATH + "bg.png"); 
		
		while(!gameOver) {
			board.clear();
			
			BarbarianManager.move();
			ArrowManager.move();
			
			bow.draw(g);
			BarbarianManager.draw(g);
			ArrowManager.draw(g);
			board.repaint();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) { }
		}
	}

}





