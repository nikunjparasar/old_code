package jrJava.practice18_alienInvader_8_usingManagers;

import java.awt.Color;
import java.awt.Graphics;

public class Torpedo {

	public int x, y; // top-center
	public static int width, height;
	public static Color color;
	public int vy;
	public boolean collided;
	public static Color explosionColor;
	public static int explosionRadius;
	
	
	static {
		width = 4;
		height = 12;
		color = Color.BLUE;
		explosionColor = Color.ORANGE;
		explosionRadius = 40;
	}
	
	public Torpedo(int x, int y, int vy) {
		this.x = x;
		this.y = y;
		this.vy = vy;
		if(this.vy>0) this.vy = -this.vy;
	}
	
	public void move() {
		y += vy;
		
		if(y<50) TorpedoManager.remove(this); 
		
		collided = AlienManager.isHit(this) || MissileManager.isHit(this);
	}
	
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.drawRect(x-width/2, y, width, height); 
		
		if(collided) {
			g.setColor(explosionColor);
			g.drawOval(x-explosionRadius, y-explosionRadius, 2*explosionRadius, 2*explosionRadius);
			
			TorpedoManager.remove(this); 
		}
	}
	
}










