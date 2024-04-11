package jrJava.maze_1;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;

public class Mouse implements Runnable, KeyListener{

	private static Image imageE, imageW, imageS, imageN;
	
	private static int size;
	
	private Image image;
	private int x, y;
	private int xSpeed, ySpeed;
	private int stepSize;
	
	static {
		imageE = new ImageIcon("jrJava/maze_1/tinyMouseE.png").getImage();
		imageW = new ImageIcon("jrJava/maze_1/tinyMouseW.png").getImage();
		imageS = new ImageIcon("jrJava/maze_1/tinyMouseS.png").getImage();
		imageN = new ImageIcon("jrJava/maze_1/tinyMouseN.png").getImage();
		size = imageE.getWidth(null);
		
	}
	
	
	public Mouse(int x, int y, int stepSize, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.stepSize = stepSize;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
		
		selectImage();
	
		
	}

	
	private void selectImage() {
		if(xSpeed == 0) {
			if(ySpeed == 1) {
				this.image = imageS;
			}
			else if(ySpeed == -1) {
				this.image = imageN;
			}
		}
		
		else if(xSpeed == -1) {
			if(ySpeed == 0) {
				this.image = imageW;
			}
		}
		
		else if(xSpeed == 1) {
			if(ySpeed == 0) {
				this.image = imageE;
			}
		}
		
	}
	
	public void draw(Graphics g) {
		g.drawImage(image, x-size/2,  y-size/2,  null);
	
	}
	
	
	private void move() {
		x+=xSpeed*stepSize;
		y+=ySpeed*stepSize;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			move();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int keyCode = e.getKeyCode();
		if(keyCode == KeyEvent.VK_RIGHT) {
			xSpeed = 1;
			ySpeed = 0;
			image = imageE;
		}
		else if(keyCode == KeyEvent.VK_LEFT) {
			xSpeed = -1;
			ySpeed = 0;
			image = imageW;
		}
		else if(keyCode == KeyEvent.VK_DOWN) {
			xSpeed = 0;
			ySpeed = 1;
			image = imageS;
		}
		else if(keyCode == KeyEvent.VK_UP) {
			xSpeed = 0;
			ySpeed = -1;
			image = imageN;
		}
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
		
}
