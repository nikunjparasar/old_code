package jrJava.maze_4_withPrizes;

import java.awt.Graphics;
import java.awt.Image;
import java.util.StringTokenizer;

import javax.swing.ImageIcon;

public class Prize {

	private Image image;
	private int score;
	private int x, y, w, h;
	private boolean toBeRemoved;
	
	private static Image targetHitImage;
	private static int targetHitImageW, targetHitImageH;
	
	
	static {
		 targetHitImage = new ImageIcon("jrJava/maze_imagesAndSounds/rings.png").getImage();
		 targetHitImageW = targetHitImage.getWidth(null);
		 targetHitImageH = targetHitImage.getHeight(null);
	}
	
	
	public Prize(String line) {
		// apple.png       300   75 175
		StringTokenizer st = new StringTokenizer(line, " ");
		image = new ImageIcon("jrJava/maze_imagesAndSounds/" + st.nextToken()).getImage();
		score = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		w = image.getWidth(null);
		h = image.getHeight(null);
	}
	
	
	public boolean toBeRemoved() { return toBeRemoved; }
	
	
	public int checkCollision(int noseX, int noseY) {
		if(noseX>=x-w/2 && noseX<=x+w/2 && noseY>=y-h/2 && noseY<=y+h/2) {
			toBeRemoved = true;
			return score;
		}
		return 0;
	}
	
	
	public void draw(Graphics g) {
		g.drawImage(image, x-w/2, y-h/2, null);
		
		if(toBeRemoved) {
			g.drawImage(targetHitImage, x-targetHitImageW/2, y-targetHitImageH/2, null);
		}
	}
	
}







