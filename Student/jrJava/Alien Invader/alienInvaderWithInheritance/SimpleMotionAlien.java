package jrJava.alienInvaderWithInheritance;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class SimpleMotionAlien extends Alien {
		
	public SimpleMotionAlien(int x, int y, Image image, Image imageAlt, int vx, int vy) {
		super(x, y, image, imageAlt, vx, vy);
	}
	

	public void move(Ship ship) {
		x += vx;
		y += vy; 
		
		if(y>690) AlienManager.remove(this); 
		
		if(x<0 || x>600) vx = -vx;
		
		
		if(y>=100 && y<=500) {
			shootMissile();
		}
		
		collided = ship.isHit(this);
	}
	
	public void draw(Graphics g) {
		drawCount++;
		if(drawCount%drawCycle<drawCycle/2) g.drawImage(image, x-size/2, y-size, size, size, null);
		else g.drawImage(imageAlt, x-size/2, y-size, size, size, null);
		
		if(collided) {
			g.setColor(explosionColor);
			g.drawOval(x-explosionRadius, y-explosionRadius, 2*explosionRadius, 2*explosionRadius);
			AlienManager.remove(this); 
		}
	}
	
	public void shootMissile() {
		if(Math.random()>0.1) return;
		MissileManager.add( new Missile(x, y+Missile.getHeight(), 2*vy) );
	}
	
}






