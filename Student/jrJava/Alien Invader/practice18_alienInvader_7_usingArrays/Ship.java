package jrJava.practice18_alienInvader_7_usingArrays;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class Ship implements MouseMotionListener, KeyListener {

	public int x, y; // top-center
	public Color color = Color.RED;
	public int eachHeight = 20;
	public int topWidth = 4, middleWidth = 20, bottomWidth = 60;
	
	public Ship(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void mouseMoved(MouseEvent e) { 
		
	}
	public void mouseDragged(MouseEvent e) {
		x = e.getX();
	}
	
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==32) {
			shootTorpedo();
		}
	}
	public void keyReleased(KeyEvent e) {
		
	}
	public void keyTyped(KeyEvent e) {
	
	}
	
	
	public void shootTorpedo() {
		Coordinator.addTorpedo(new Torpedo(x, y-Torpedo.height, -7)); 
		//Coordinator.addTorpedo(new Torpedo(x + 20, y-Torpedo.height + 40, -7)); 
		//Coordinator.addTorpedo(new Torpedo(x - 20, y-Torpedo.height + 40, -7)); 
	}
	
	
	public boolean isHit(Alien alien) {
		if(isHit(alien.x, alien.y, Alien.size, Alien.size)) {
			Coordinator.gameOver = true;
			return true;
		}
		return false;
	}
	
	
	public boolean isHit(Missile missile) {
		if(isHit(missile.x, missile.y, Missile.width, Missile.height)) {
			Coordinator.gameOver = true;
			return true;
		}
		return false;
	}
	
	
	public boolean isHit(int xBC, int yBC, int w, int h) {
		   return xBC>=x-topWidth/2-w/2 && xBC<=x+topWidth/2+w/2 && yBC>=y+0*eachHeight && yBC<=y+1*eachHeight+h ||
		          xBC>=x-middleWidth/2-w/2 && xBC<=x+middleWidth/2+w/2 && yBC>=y+1*eachHeight && yBC<=y+2*eachHeight+h ||
		          xBC>=x-bottomWidth/2-w/2 && xBC<=x+bottomWidth/2+w/2 && yBC>=y+2*eachHeight && yBC<=y+3*eachHeight+h;
	}
	
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.drawRect(x-topWidth/2, y, topWidth, eachHeight);
		g.drawRect(x-middleWidth/2, y+eachHeight, middleWidth, eachHeight);
		g.drawRect(x-bottomWidth/2, y+2*eachHeight, bottomWidth, eachHeight);
 	}
}













