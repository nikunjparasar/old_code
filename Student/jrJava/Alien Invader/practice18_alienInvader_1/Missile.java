package jrJava.practice18_alienInvader_1;

import java.awt.Color;
import java.awt.Graphics;

public class Missile {

	
	public int x,y;// bottom center
	public static int height, width;
	public static Color color;
	public static int vy;
	
	static {
		height = 10;
		width = 4;
		color = Color.RED;
	}
	
	public Missile(int x, int y, int vy) {
		this.x = x;
		this.y = y;
		this.vy = vy;
	}

	public void move(){
		y += vy;
	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.drawRect(x-width/2, y-height, width, height);
		
	}
	
	

}
