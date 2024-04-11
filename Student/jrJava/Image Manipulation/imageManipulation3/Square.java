package jrJava.imageManipulation3;

import java.awt.Color;
import java.awt.Graphics;

public class Square {

	private int x, y; // top left
	private int size;
	private Color color;
	private int vx, vy;
	
	public Square(int x, int y, int size, Color color, int vx, int vy) {
		super();
		this.x = x;
		this.y = y;
		this.size = size;
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
		g.drawRect(x, y, size, size);
	}
	
}





