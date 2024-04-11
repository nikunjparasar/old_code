package jrJava.practice18_alienInvader_3;

import java.awt.Color;
import java.awt.Graphics;

public class Missile {

	public int x, y; // bottom-center
	public static int width, height;
	public static Color color;
	public int vy;
	public boolean collided;
	public static Color explosionColor;
	public static int explosionRadius;
	
	
	static {
		width = 4;
		height = 10;
		color = Color.RED;
		explosionColor = Color.RED;
		explosionRadius = 80;
	}
	
	public Missile(int x, int y, int vy) {
		this.x = x;
		this.y = y;
		this.vy = vy;
	}
	
	
	public void move() {
		y += vy;
		collided = Coordinator.ship.isHit(this);
	}
	
	
	public boolean isHit(Torpedo torpedo) {
		
		if(torpedo.x>=x-width/2-Torpedo.width/2 && 
		   torpedo.x<=x+width/2+Torpedo.width/2 &&
		   torpedo.y>=y-height-Torpedo.height	&& 
		   torpedo.y<=y) {
			
			Coordinator.missile = null;
			return true;
		}
		
		return false;
	}
	
	
	public void draw(Graphics g) {
		g.setColor(color); 
		g.drawRect(x-width/2, y-height, width, height); 
		
		if(collided) {
			g.setColor(explosionColor);
			g.drawOval(x-explosionRadius, y-explosionRadius, 2*explosionRadius, 2*explosionRadius);
			Coordinator.missile = null;
		}
	}
}





