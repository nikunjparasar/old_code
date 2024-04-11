package jrJava.alienInvaderWithInheritance;

import java.awt.Image;

public class NastyAlien extends SimpleMotionAlien {

	public NastyAlien(int x, int y, Image image, Image imageAlt, int vx, int vy) {
		super(x, y , image, imageAlt, vx, vy); 
	}
	

	public void move(Ship ship) {
		
		x = (int)(0.95*x + 0.05*ship.getX());
		y += vy; 
		
		if(y>690) AlienManager.remove(this); 
		
		if(x<0 || x>600) vx = -vx;
		
		
		if(y>=100 && y<=500) {
			shootMissile();
		}
		
		collided = ship.isHit(this);
	}	
	
}
