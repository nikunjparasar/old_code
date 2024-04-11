package jrJava.practice12;

import java.awt.Graphics;
import resources.DrawingBoard;

public class Practice4 {

	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(200, 0, 600, 600);
		
		int i;
		for(i=1; i<=10; i++) {
			Radar.displayRadar(board, 200, 300, 300);
		}
		
	}
 
} 
