package jrJava.barbarianAttack3;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Arrow {

	private static Image eImage;
	private static int eWidth, eHeight;
	private double x, y, vx, vy, length;
	private double gravity = -0.5;
	private boolean isCollided;
	
	
	static {
		eImage = new ImageIcon(Coordinator.R_PATH + "explosion.png").getImage();
		eWidth = eImage.getWidth(null);
		eHeight = eImage.getHeight(null);
	}
	
	
	public Arrow(double x, double y, double vx, double vy, double length) {
		super();
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		this.length = length;
	}
	
	public double getX() { return x; }
	public double getY() { return y; }
	public boolean isCollided() { return isCollided; }
	
	
	public void move() {
		
		for(int i=0; i<10; i++) {
			x += vx/10;
			y += vy/10;
			vy -= gravity/10;
			
			// check collisions.
			if(BarbarianManager.isHit(this)) {
				isCollided = true;
			}
		}
		
		//if(x<400 || y>600) ArrowManager.remove(this); 
	}
	
	public void draw(Graphics2D g) {
		g.setColor(Color.BLACK);
		double hyp = Math.sqrt(vx*vx + vy*vy);
		g.drawLine((int)x, (int)y, (int)(x+length*vx/hyp), (int)(y+length*vy/hyp));
		
		if(isCollided) {
			g.drawImage(eImage, (int)x-eWidth/2, (int)y-eHeight/2, null);
			//ArrowManager.remove(this);
		}
	}
	
}






