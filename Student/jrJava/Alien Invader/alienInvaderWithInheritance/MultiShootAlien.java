package jrJava.alienInvaderWithInheritance;

import java.awt.Image;

public class MultiShootAlien extends SimpleMotionAlien{

	public MultiShootAlien(int x, int y, Image image, Image imageAlt, int vx, int vy) {
		super(x, y , image, imageAlt, vx, vy); 
	}
	
	
	public void shootMissile() {
		if(Math.random()>0.1) return;
		MissileManager.add( new Missile(x-size/4, y+Missile.getHeight(), 2*vy) );
		MissileManager.add( new Missile(x, y+Missile.getHeight(), 2*vy) );
		MissileManager.add( new Missile(x+size/4, y+Missile.getHeight(), 2*vy) );
	}
	
	
}
