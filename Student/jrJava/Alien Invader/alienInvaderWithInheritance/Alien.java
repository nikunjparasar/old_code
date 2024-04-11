package jrJava.alienInvaderWithInheritance;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public abstract class Alien {
	
	protected int x, y; // bottom-center
	public static final int size; // we will learn 'final' soon.
	protected Image image, imageAlt;
	protected int vx, vy;
	protected boolean collided;
	public static final Color explosionColor;
	public static final int explosionRadius;
	
	protected int drawCount;
	protected int drawCycle = 6;
	
	
	static {
		size = 40;
		explosionColor = Color.GREEN;
		explosionRadius = 100;
	}
	
	
	public Alien(int x, int y, Image image, Image imageAlt, int vx, int vy) {
		super();
		this.x = x;
		this.y = y;
		this.image = image;
		this.imageAlt = imageAlt;
		this.vx = vx;
		this.vy = vy;
	}
	
	
	public abstract void move(Ship ship);
	
	
	public boolean isHit(Torpedo torpedo) {
		
		if(torpedo.x>=x-size/2-Torpedo.getWidth()/2 && 
		   torpedo.x<=x+size/2+Torpedo.getWidth()/2 &&
		   torpedo.y>=y-size-Torpedo.getHeight()	&& 
		   torpedo.y<=y) {
			
			AlienManager.remove(this); 
			return true;
		}
		
		return false;
	}
	
	
	public abstract void draw(Graphics g);
	
	public abstract void shootMissile();
	
}






