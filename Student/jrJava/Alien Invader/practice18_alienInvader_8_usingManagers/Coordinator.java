package jrJava.practice18_alienInvader_8_usingManagers;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;
import resources.Timer;

public class Coordinator {

	public static boolean gameOver;
	
	
	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(200, 0, 600, 700);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();
		
		Ship ship = new Ship(200, 600);
		
		board.addMouseMotionListener(ship);
		board.getJFrame().addKeyListener(ship); 
		
		while(!gameOver) {
		
			board.clear();
			
			ship.draw(g);
			
			AlienManager.create();
			
			MissileManager.move(ship);
			MissileManager.draw(g);
			
			AlienManager.move(ship);
			AlienManager.draw(g);
			
			TorpedoManager.move();
			TorpedoManager.draw(g);			
			
			board.repaint();
			timer.pause(50); 
		}
	}

	
}






