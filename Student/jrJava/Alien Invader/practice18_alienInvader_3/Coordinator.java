package jrJava.practice18_alienInvader_3;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;
import resources.Timer;

public class Coordinator {

	public static boolean gameOver;
	
	public static Alien alien;
	public static Missile missile;
	public static Torpedo torpedo;
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
			
			if(torpedo!=null) {
				torpedo.move();
				torpedo.draw(g);
			}
			
			board.repaint();
			timer.pause(50);
		}
		
	}

}






