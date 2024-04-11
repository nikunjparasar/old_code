package jrJava.alienInvaderWithInheritance;

import java.awt.AlphaComposite;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class CloakAlien extends SimpleMotionAlien {

	protected float transparency = 1.0f;
	protected float cloakRate = 0.015f;
	
	
	public CloakAlien(int x, int y, Image image, Image imageAlt, int vx, int vy) {
		super(x, y , image, imageAlt, vx, vy); 
	}
	
	public void draw(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		Composite original = g2.getComposite();
		
		transparency -= cloakRate;
		if(transparency<0) transparency = 0.0f;
		
		if(collided) transparency = 1.0f;
		
		Composite c = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, transparency);
		
		g2.setComposite(c); 
		
		drawCount++;
		if(drawCount%drawCycle<drawCycle/2) g.drawImage(image, x-size/2, y-size, size, size, null);
		else g.drawImage(imageAlt, x-size/2, y-size, size, size, null);
		
		if(collided) {
			g.setColor(explosionColor);
			g.drawOval(x-explosionRadius, y-explosionRadius, 2*explosionRadius, 2*explosionRadius);
			AlienManager.remove(this); 
		}
		
		g2.setComposite(original); 
	}
}




