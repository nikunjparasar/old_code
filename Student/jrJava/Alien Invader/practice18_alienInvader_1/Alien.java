package jrJava.practice18_alienInvader_1;

import java.awt.Color;
import java.awt.Graphics;

public class Alien {
	
	public int x,y;// bottom center
	public static int size;
	public Color bodyColor;
	public static int eyeRadius;
	public Color eyeColor;
	public int vx, vy;
	
	
	
	static {
		size = 25;
		eyeRadius = 4;
	}
	
	public Alien(int x, int y, Color bodyColor, Color eyeColor,  int vx, int vy) {
		this.x = x;
		this.y = y;
		this.bodyColor = bodyColor;
		this.eyeColor = eyeColor;
		this.vx = vx;
		this.vy = vy;
		
		
	}
	
	public boolean isHit(Torpedo torpedo) {
		return false;
		//collision logic
	}
	
	
	public void move() {
		x += vx;
		y += vy; //vy > 0
		
		if(y == 200 && y < 200+vy) {
			shootMissile();
		}

	}
	
	public void draw(Graphics g) {
		g.setColor(bodyColor);
		g.drawRect(x- size/2, y-size, size, size);
		g.setColor(eyeColor);
		g.fillOval(x-size/4-eyeRadius, y-size*3/4-eyeRadius, 2*eyeRadius, 2*eyeRadius);
		g.fillOval(x+size/4-eyeRadius, y-size*3/4-eyeRadius, 2*eyeRadius, 2*eyeRadius);
	}
	
	public void shootMissile() {
		Coordinator.missile = new Missile(x, y + Missile.height, 2*vy);
	}
	

}
