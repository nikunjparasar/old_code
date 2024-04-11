package jrJava.barbarianAttack3;

import java.awt.Graphics2D;
import java.awt.Image;
import java.util.Iterator;

import javax.swing.ImageIcon;

public class BarbarianManager {

	private static LinkedList<Barbarian> barbarians;
	
	private static Image[][] imagePairs;
	
	static {
		barbarians = new LinkedList<Barbarian>();
		//barbarians = new LinkedList<Barbarian>();
		
		imagePairs = new Image[6][];
		for(int i=0; i<imagePairs.length; i++) imagePairs[i] = new Image[2];
		
		imagePairs[0][0] = new ImageIcon(Coordinator.R_PATH + "barbarian_robot1_image1.png").getImage();
		imagePairs[0][1] = new ImageIcon(Coordinator.R_PATH + "barbarian_robot1_image2.png").getImage();
		imagePairs[1][0] = new ImageIcon(Coordinator.R_PATH + "barbarian_robot2_image1.png").getImage();
		imagePairs[1][1] = new ImageIcon(Coordinator.R_PATH + "barbarian_robot2_image2.png").getImage();
		imagePairs[2][0] = new ImageIcon(Coordinator.R_PATH + "barbarian_robot3_image1.png").getImage();
		imagePairs[2][1] = new ImageIcon(Coordinator.R_PATH + "barbarian_robot3_image2.png").getImage();
		imagePairs[3][0] = new ImageIcon(Coordinator.R_PATH + "barbarian_robot4_image1.png").getImage();
		imagePairs[3][1] = new ImageIcon(Coordinator.R_PATH + "barbarian_robot4_image2.png").getImage();
		imagePairs[4][0] = new ImageIcon(Coordinator.R_PATH + "dragon1_image1.png").getImage();
		imagePairs[4][1] = new ImageIcon(Coordinator.R_PATH + "dragon1_image2.png").getImage();
		imagePairs[5][0] = new ImageIcon(Coordinator.R_PATH + "dragon2_image1.png").getImage();
		imagePairs[5][1] = new ImageIcon(Coordinator.R_PATH + "dragon2_image2.png").getImage();
	}
	
	
	private static void launchBarbarian() {
		if(Math.random()>0.05) return;
		
		if(Math.random()>0.3) {
			barbarians.insert(new RunningBarbarian(imagePairs[(int)(Math.random()*4)], 
					                            -imagePairs[0][0].getWidth(null), 
					                            600, (int)(Math.random()*3)+1));
		}
		else {
			barbarians.insert(new FlyingBarbarian(imagePairs[(int)(Math.random()*2+4)], 
					                            -imagePairs[4][0].getWidth(null), 
					                            100+(int)(Math.random()*400), 
					                            (int)(Math.random()*4+2), 50));
		}
	}
	
	public static void move() {
		launchBarbarian();
		
		Iterator<Barbarian> iter = barbarians.iterator();
		while(iter.hasNext()) {
			iter.next().move();
		}
	}
	
	public static void draw(Graphics2D g) {
		Iterator<Barbarian> iter = barbarians.iterator();
		while(iter.hasNext()) {
			iter.next().draw(g);
		}
	}
	
	public static boolean isHit(Arrow arrow) {
		Iterator<Barbarian> iter = barbarians.iterator();
		while(iter.hasNext()) {
			if(iter.next().isHit(arrow)) {
				iter.remove();
				return true;
			}
		}
		return false;
	}
}




