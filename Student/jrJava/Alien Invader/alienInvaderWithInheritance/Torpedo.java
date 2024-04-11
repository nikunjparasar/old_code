package jrJava.alienInvaderWithInheritance;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import resources.SoundPlayer;

public class Torpedo {

	protected int x, y; // top-center
	protected static int width, height;
	protected static Image image;
	protected int vy;
	protected boolean collided;
	protected static Color explosionColor;
	protected static int explosionRadius;
	
    protected SoundPlayer explosion;
	
	
	static {
		image = new ImageIcon(Coordinator.path + "torpedo.png").getImage();
		width = image.getWidth(null);
		height = image.getHeight(null);
		explosionColor = Color.ORANGE;
		explosionRadius = 40;
	}
	
	public Torpedo(int x, int y, int vy) {
		this.x = x;
		this.y = y;
		this.vy = vy;
		if(this.vy>0) this.vy = -this.vy;
		
		explosion = new SoundPlayer(Coordinator.path + "explode.wav");
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





	public void move() {
		y += vy;
		
		if(y<50) TorpedoManager.remove(this); 
		
		collided = AlienManager.isHit(this) || MissileManager.isHit(this);
		if(collided) explosion.play();
	}
	
	
	public void draw(Graphics g) {
		g.drawImage(image, x-width/2, y, null);
		
		if(collided) {
			g.setColor(explosionColor);
			g.drawOval(x-explosionRadius, y-explosionRadius, 2*explosionRadius, 2*explosionRadius);
			
			TorpedoManager.remove(this); 
		}
	}
	
}










