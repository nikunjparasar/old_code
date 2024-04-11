package jrJava.imageManipulation4;

import java.awt.Color;
import java.awt.Graphics;

public class Circle {

	private int x, y; // center
	private int radius;
	private Color color;
	private int vx, vy;
	
	
	public Circle(int x, int y, int radius, Color color, int vx, int vy) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = color;
		this.vx = vx;
		this.vy = vy;
	}
	
	public void move() {
		x += vx;
		y += vy;
	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.drawOval(x-radius, y-radius, 2*radius, 2*radius);
	}
	
} 


