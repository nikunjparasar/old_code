package jrJava.practice18_alienInvader_2;

import java.awt.Color;
import java.awt.Graphics;

public class Alien {

	public int x, y; // bottom-center
	public static int size;
	public Color bodyColor;
	public static int eyeRadius;
	public Color eyeColor;
	public int vx, vy;
	public boolean collided;
	public static Color explosionColor;
	public static int explosionRadius;
	
	
	static {
		size = 25;
		eyeRadius = 4;
		explosionColor = Color.GREEN;
		explosionRadius = 100;
	}
	
	
	public Alien(int x, int y, Color bodyColor, Color eyeColor, int vx, int vy) {
		this.x = x;
		this.y = y;
		this.bodyColor = bodyColor;
		this.eyeColor = eyeColor;
		this.vx = vx;
		this.vy = vy;
	}
	
	
	public void move() {
		x += vx;
		y += vy; 
		
		if(x>=300 && x<300+vx) {
			shootMissile();
		}
		
		collided = Coordinator.ship.isHit(this);
	}
	
	
	public boolean isHit(Torpedo torpedo) {
		
		if(torpedo.x>=x-size/2-Torpedo.width/2 && 
		   torpedo.x<=x+size/2+Torpedo.width/2 &&
		   torpedo.y>=y-size-Torpedo.height	&& 
		   torpedo.y<=y) {
			
			Coordinator.alien = null;
			return true;
		}
		
		return false;
	}
	
	
	public void draw(Graphics g) {
		g.setColor(bodyColor);
		g.drawRect(x-size/2, y-size, size, size);
		
		g.setColor(eyeColor);
		g.fillOval(x-size/4-eyeRadius, y-size*3/4-eyeRadius, 2*eyeRadius, 2*eyeRadius); 
		g.fillOval(x+size/4-eyeRadius, y-size*3/4-eyeRadius, 2*eyeRadius, 2*eyeRadius); 
		
		if(collided) {
			g.setColor(explosionColor);
			g.drawOval(x-explosionRadius, y-explosionRadius, 2*explosionRadius, 2*explosionRadius);
			Coordinator.alien = null;
		}
	}
	
	public void shootMissile() {
		Coordinator.missile = new Missile(x, y+Missile.height, 2*vy);
	}
	
}
