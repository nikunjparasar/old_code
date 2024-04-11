package jrJava.practice18_alienInvader_6_moreTorpedos;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;
import resources.Timer;

public class Coordinator {

	public static boolean gameOver;
	
	public static Alien alien;
	public static Missile missile;
	public static Torpedo torpedo1, torpedo2, torpedo3;
	public static Ship ship;
	
	
	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(200, 0, 600, 700);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();
		
		ship = new Ship(200, 600);
		alien = new Alien(250, 0, Color.GREEN, Color.GRAY, 1, 4);
		
		board.addMouseMotionListener(ship);
		board.getJFrame().addKeyListener(ship); 
		
		while(!gameOver) {
		
			board.clear();
			
			ship.draw(g);
			
			if(alien!=null) {
				alien.move();
				alien.draw(g);
			}
			
			if(missile!=null) {
				missile.move();
				missile.draw(g);
			}
			
			if(torpedo1 != null) {
				torpedo1.move();
			}
			if(torpedo1 != null) {
				torpedo1.draw(g);
			}
			
			if(torpedo2 != null) {
				torpedo2.move();
			}
			if(torpedo2 != null) {
				torpedo2.draw(g);
			}
			
			if(torpedo3 != null) {
				torpedo3.move();
			}
			if(torpedo3 != null) {
				torpedo3.draw(g);
			}
			
			board.repaint();
			timer.pause(50);
		}
		
		
		
		
	}
	
	public static void addTorpedo(Torpedo torpedo) {
		if(torpedo1 == null)torpedo1 = torpedo;
		else if(torpedo2 == null)torpedo2 = torpedo;
		else if(torpedo3 == null)torpedo3 = torpedo;
	}
	
	public static void removeTorpedo(Torpedo torpedo) {
		if(torpedo1 == torpedo)torpedo1 = null;
		else if(torpedo2 == torpedo)torpedo2 = null;
		else if(torpedo3 == torpedo)torpedo3 = null;
	}

}






