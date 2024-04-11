package jrJava.maze_4_withPrizes;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;


public class Maze {

	public static final int MIN_THICKNESS = 4;
	
	private BufferedImage maze;
	private ArrayList<Prize> prizes;
	
	
	public Maze() {
		try {
			maze = ImageIO.read(new File("jrJava/maze_imagesAndSounds/maze.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		prizes = new ArrayList<Prize>();
		
		try {
			Scanner s = new Scanner(new File("jrJava/maze_imagesAndSounds/targets.txt"));
			
			while(s.hasNextLine()) {
				prizes.add(new Prize(s.nextLine()));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public int checkCollisionWithPrizes(int noseX, int noseY) {
		int total = 0;
		for(int i=0; i<prizes.size(); i++) {
			total += prizes.get(i).checkCollision(noseX, noseY);
		}
		return total;
	}
	
	
	public void draw(Graphics g) {
		g.drawImage(maze, 0, 0, null);
		
		Prize each;
		for(int i=prizes.size()-1; i>=0; i--) {
			each = prizes.get(i);
			each.draw(g); 
			if(each.toBeRemoved()) {
				prizes.remove(i);
			}
		}
	}
	
	
	public boolean hitWall(int x, int y) {
		int alpha = (maze.getRGB(x, y)>>24) & 0xFF;
		return alpha>100;
	}
	
	/*
	public static void main(String[] aaa) {
		Maze maze = new Maze();
		int x, y;
		for(y=0; y<30; y++) {
			for(x=0; x<120; x++) {
				if(maze.hitWall(x, y)) System.out.print(1);
				else System.out.print(0);
			}
			System.out.println();
		}
	}
	*/
}























