package jrJava.practice18_alienInvader_1;

import java.awt.Color;
import java.awt.Graphics;

public class Torpedo {
	
	public int x,y;// bottom center
	public static int height, width;
	public static Color color;
	public int vy;
	
	static {
		height = 12;
		width = 4;
		color = Color.BLUE;
	}
	
	public Torpedo(int x, int y, int vy) {//vy = negative
		this.x = x;
		this.y = y;
		this.vy = vy;
		
		if(this.vy > 0) {
			this.vy = -vy;
	
		}
		
	}

	public void move(){
		y += vy;
	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.drawRect(x-width/2, y, width, height);
		
	}
}
