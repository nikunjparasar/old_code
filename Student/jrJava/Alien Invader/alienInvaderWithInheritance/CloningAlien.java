package jrJava.alienInvaderWithInheritance;

import java.awt.Image;

public class CloningAlien extends SimpleMotionAlien {
	
	protected int distance;
	protected int requiredDistance;
	
	public CloningAlien(int x, int y, Image image, Image imageAlt, int vx, int vy) {
		super(x, y, image, imageAlt, vx, vy);
		distance = 0;
		requiredDistance = 100 + (int)(Math.random()*200);
	}
	public void move(Ship ship) {
		x += vx;
		y += vy; 
		distance += vy;
		if(distance>requiredDistance) {
			Alien clone = new CloningAlien(x, y, image, imageAlt, -vx, vy);
			AlienManager.add(clone);
			distance = 0;
		}
		
		if(y>690) AlienManager.remove(this); 
		
		if(x<0 || x>600) vx = -vx;
		
		
		if(y>=100 && y<=500) {
			shootMissile();
		}
		
		collided = ship.isHit(this);
	}
	 

}
