package jrJava.practice8;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;
import resources.Timer;

public class ColorPalette {

	public static void main(String[] args) {
		
		int tileSize = 20; // Square shape tile
		int numberOfTiles = 30;
		int margin = 50;
		
		DrawingBoard board = new DrawingBoard(100, 0, tileSize*numberOfTiles + 2*margin, tileSize*numberOfTiles + 2*margin);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();
		board.clear();
		
		int i, j;
		
		for(i=1; i<=numberOfTiles; i++) {
			
			for(j=1; j<=numberOfTiles; j++) {
				
				Color color = new Color(0, 225/numberOfTiles*i, 225/numberOfTiles*j);
				
				g.setColor(color);
				g.fillRect(margin + (i-1)*tileSize, margin + (j-1)*tileSize, tileSize, tileSize);
				
				g.setColor(Color.BLACK);
				g.drawRect(margin + (i-1)*tileSize, margin + (j-1)*tileSize, tileSize, tileSize);
				
				board.repaint();
				timer.pause(5);
				
			}
		
		}
		
		
	}

}









