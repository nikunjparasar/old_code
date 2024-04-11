package jrJava.maze_4_withPrizes;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.StringTokenizer;

import javax.swing.ImageIcon;

import resources.SoundPlayer;

public class Mouse implements Runnable, KeyListener {

	private static Image imageE, imageW, imageS, imageN;
	private static int size;
	private static SoundPlayer eatingSound;
	
	private Image image;
	private int x, y;
	private int xSpeed, ySpeed;
	private int stepSize;
	
	private MessageSender sender;
	private Maze maze;
	private SoundPlayer bgSound;
	private boolean bgSoundStopped;
	
	
	static {
		imageE = new ImageIcon("jrJava/maze_1/tinyMouseE.png").getImage();
		imageW = new ImageIcon("jrJava/maze_1/tinyMouseW.png").getImage();
		imageS = new ImageIcon("jrJava/maze_1/tinyMouseS.png").getImage();
		imageN = new ImageIcon("jrJava/maze_1/tinyMouseN.png").getImage();
		size = imageE.getWidth(null);
		
		eatingSound = new SoundPlayer("jrJava/maze_imagesAndSounds/lip.wav");
	}
	
	
	public Mouse(boolean isActive, int x, int y, int stepSize, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.stepSize = stepSize;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
		selectImage();
		
		if(isActive) {
			bgSound = new SoundPlayer("jrJava/maze_imagesAndSounds/bgSound.wav");
			bgSoundStopped = true;
		}
	}
	
	
	public void setMessageSender(MessageSender sender) {
		this.sender = sender;
	}
	
	
	public void setMaze(Maze maze) { this.maze = maze; }
	
	
	private void selectImage() {
		if(xSpeed==1 && ySpeed==0) image = imageE;
		else if(xSpeed==-1 && ySpeed==0) image = imageW;
		else if(xSpeed==0 && ySpeed==1) image = imageS;
		else if(xSpeed==0 && ySpeed==-1) image = imageN;
	}
	
	
	public void draw(Graphics g) {
		g.drawImage(image, x-size/2, y-size/2, null);
	}
	
	private void sendData() {
		StringBuilder sb = new StringBuilder();
		sb.append(x);
		sb.append(',');
		sb.append(y);
		sb.append(',');
		sb.append(xSpeed);
		sb.append(',');
		sb.append(ySpeed);
		
		sender.send(sb.toString());
	}
	
	public void receiveData(String msg) {
		StringTokenizer st = new StringTokenizer(msg, ",");
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		xSpeed = Integer.parseInt(st.nextToken());
		ySpeed = Integer.parseInt(st.nextToken());
		
		selectImage();
		
		int score = maze.checkCollisionWithPrizes(x + xSpeed*size/2 , y + ySpeed*size/2);
		if(score>0) eatingSound.play();
	}
	
	
	private boolean isCollided() {
		
		if(xSpeed!=0) { // horizontal move
			int xProbe = x + xSpeed*size/2;
			for(int yProbe = y-size/2+Maze.MIN_THICKNESS;
				yProbe<=y+size/2-Maze.MIN_THICKNESS; yProbe+=Maze.MIN_THICKNESS) {
				if(maze.hitWall(xProbe, yProbe)) return true;
			}
		}
		else { // vertical move
			int yProbe = y + ySpeed*size/2;
			for(int xProbe = x-size/2+Maze.MIN_THICKNESS;
				xProbe<=x+size/2-Maze.MIN_THICKNESS; xProbe+=Maze.MIN_THICKNESS) {
				if(maze.hitWall(xProbe, yProbe)) return true;
			}
		}
		
		return false;
	}
	
	
	private void move() {
		x += xSpeed*stepSize;
		y += ySpeed*stepSize;
	}
	
	public void run() {
		while(true) {
			if(!isCollided()) {
				move();
				int score = maze.checkCollisionWithPrizes(x + xSpeed*size/2 , y + ySpeed*size/2);
				if(score>0) eatingSound.play();
				
				if(bgSoundStopped) {
					bgSound.playLoop();
					bgSoundStopped = false;
				}
			}
			else {
				bgSound.stop();
				bgSoundStopped = true;
			}
			
			sendData();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) { }
		}
	}
	
	
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		if(keyCode==KeyEvent.VK_RIGHT) {
			xSpeed = 1; ySpeed = 0; image = imageE;
		}
		else if(keyCode==KeyEvent.VK_LEFT) {
			xSpeed = -1; ySpeed = 0; image = imageW;
		}
		else if(keyCode==KeyEvent.VK_DOWN) {
			xSpeed = 0; ySpeed = 1; image = imageS;
		}
		else if(keyCode==KeyEvent.VK_UP) {
			xSpeed = 0; ySpeed = -1; image = imageN;
		}
	}
	
	
	public void keyReleased(KeyEvent e) { }
	public void keyTyped(KeyEvent e) { }

}





















