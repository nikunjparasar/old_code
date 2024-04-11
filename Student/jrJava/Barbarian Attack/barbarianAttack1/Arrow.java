package jrJava.barbarianAttack1;

import java.awt.Color;
import java.awt.Graphics2D;

public class Arrow {

	private double x, y, vx, vy, length;
	private double gravity = -0.5;
	
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
	
	
	public void move() {
		x += vx;
		y += vy;
		vy -= gravity;
	
		//if(x<400 || y>600) ArrowManager.remove(this); 
	}
	
	public void draw(Graphics2D g) {
		g.setColor(Color.BLACK);
		double hyp = Math.sqrt(vx*vx + vy*vy);
		g.drawLine((int)x, (int)y, (int)(x+length*vx/hyp), (int)(y+length*vy/hyp));
	}
	
}






