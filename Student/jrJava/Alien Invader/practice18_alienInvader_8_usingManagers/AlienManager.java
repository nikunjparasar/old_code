package jrJava.practice18_alienInvader_8_usingManagers;

import java.awt.Color;
import java.awt.Graphics;

public class AlienManager {

	public static Alien[] aliens;
	
	public static Color[] colors = {Color.RED, Color.BLUE, Color.GREEN,
            Color.CYAN, Color.ORANGE, Color.PINK,
            Color.MAGENTA, new Color(50, 200, 200)};

	public static Color[] eyeColors = {Color.BLACK, Color.GRAY, Color.LIGHT_GRAY};

	
	static {
		aliens = new Alien[100];
	}
	
	
	public static void create() {
		if(Math.random()>0.05) return;
		
		int x = (int)(Math.random()*601);
		int vx = (int)(Math.random()*7) - 3;
		int vy = (int)(Math.random()*5) + 3;
		Color bodyColor = colors[(int) (Math.random()*colors.length)];
		Color eyeColor = eyeColors[(int)(Math.random()*eyeColors.length)];
		
		Alien alien = new Alien(x, 0, bodyColor, eyeColor, vx, vy);
		boolean shouldContinue = true;
		for(int i=0; i<aliens.length && shouldContinue; i++) {
			if(aliens[i]==null) {
				aliens[i] = alien;
				shouldContinue = false;
			}
		}
	}
	
	
	public static void move(Ship ship) {
		for(int i=0; i<aliens.length; i++) {
			if(aliens[i]!=null) aliens[i].move(ship);
		}
	}
	
	public static void draw(Graphics g) {
		for(int i=0; i<aliens.length; i++) {
			if(aliens[i]!=null) aliens[i].draw(g);
		}
	}
	
	
	public static boolean isHit(Torpedo torpedo) {
		for(int i=0; i<aliens.length; i++) {
			if(aliens[i]!=null) {
				if(aliens[i].isHit(torpedo)) return true;
			}
		}
		return false;
	}
	
	public static void remove(Alien alien) {
		boolean shouldContinue = true;
		for(int i=0; i<aliens.length && shouldContinue; i++) {
			if(aliens[i]==alien) {
				aliens[i] = null;
				shouldContinue = false;
			}
		}
	}
	
	
	
	
}
