package jrJava.alienInvaderWithInheritance;

import java.awt.Color;
import java.awt.Graphics;

public class PulsingTorpedo extends Torpedo{

	private int pulseSize = 16;
	private int count;
	private int pulseCycle =7;
	
	public PulsingTorpedo(int x, int y, int vy) {
		super(x, y, vy);
		
	}
	
	public void draw(Graphics g) {
		
		count++;
		if(count%pulseCycle == 0) {
			g.setColor(Color.WHITE);
			g.fillOval(x- pulseSize/2, y+height/8 - pulseSize/2, pulseSize, pulseSize);
		}
		g.drawImage(image, x-width/2, y, null);
		
		if(collided) {
			g.setColor(explosionColor);
			g.drawOval(x-explosionRadius, y-explosionRadius, 2*explosionRadius, 2*explosionRadius);
			
			TorpedoManager.remove(this); 
		}
	}

}
