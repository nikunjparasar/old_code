package jrJava.practice18_alienInvader_7_usingArrays;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;
import resources.Timer;

public class Coordinator {

	public static boolean gameOver;
	
	public static Alien alien;
	public static Missile missile;
	public static Torpedo[] torpedoes; 
	public static Ship ship;
	

	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(200, 0, 600, 700);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();
		
		ship = new Ship(200, 600);
		alien = new Alien(250, 0, Color.GREEN, Color.GRAY, 1, 4);
		
		board.addMouseMotionListener(ship);
		board.getJFrame().addKeyListener(ship); 
		
		torpedoes = new Torpedo[100];
		
		
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
			
			for(int i=0; i<torpedoes.length; i++) {
				if(torpedoes[i]!=null) torpedoes[i].move(); 
			}
			for(int i=0; i<torpedoes.length; i++) {
				if(torpedoes[i]!=null) torpedoes[i].draw(g); 
			}
			
			
			board.repaint(); 
			timer.pause(50);
		}
	}
	
	
	
	
	public static void addTorpedo(Torpedo torpedo) {
		boolean shouldContinue = true;
		for(int i=0; i<torpedoes.length && shouldContinue; i++) {
			if(torpedoes[i]==null) {
				torpedoes[i] = torpedo;
				shouldContinue = false;
			}
		}
	}
	
	
	public static void removeTorpedo(Torpedo torpedo) {
		boolean shouldContinue = true;
		for(int i=0; i<torpedoes.length && shouldContinue; i++) {
			if(torpedoes[i]==torpedo) {
				torpedoes[i] = null;
				shouldContinue = false;
			}
		}
	}
}






