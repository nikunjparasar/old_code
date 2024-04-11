package jrJava.alienInvaderWithInheritance;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Missile {

	public int x, y; // bottom-center
	private static int width, height;
	private static Image image;
	private int vy;
	private boolean collided;
	private static Color explosionColor;
	private static int explosionRadius;
	
	
	static {
		image = new ImageIcon(Coordinator.path + "missile.png").getImage();
		width = image.getWidth(null);
		height = image.getHeight(null);
		explosionColor = Color.RED;
		explosionRadius = 80;
	}
	
	public Missile(int x, int y, int vy) {
		this.x = x;
		this.y = y;
		this.vy = vy;
	}
	
	
	

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public static int getWidth() {
		return width;
	}

	public static int getHeight() {
		return height;
	}
	
	

	public void move(Ship ship) {
		y += vy;
		
		if(y>690) MissileManager.remove(this);
		
		collided = ship.isHit(this);
	}
	
	
	public boolean isHit(Torpedo torpedo) {
		
		if(torpedo.getX()>=x-width/2-Torpedo.getWidth()/2 && 
		   torpedo.getX()<=x+width/2+Torpedo.getWidth()/2 &&
		   torpedo.getY()>=y-height-Torpedo.getHeight()	&& 
		   torpedo.getY()<=y) {
			
			MissileManager.remove(this); 
			return true;
		}
		
		return false;
	}
	
	
	public void draw(Graphics g) {
		g.drawImage(image, x-width/2, y-height, null);  
		
		if(collided) {
			g.setColor(explosionColor);
			g.drawOval(x-explosionRadius, y-explosionRadius, 2*explosionRadius, 2*explosionRadius);
			MissileManager.remove(this);
		}
	}
}





