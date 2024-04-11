package jrJava.tetris_step_3_rotation_mirror;

import resources.*;
import java.awt.*;

public class Coordiantor {

	
	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(500, 600);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();
		
		TetrisObject tObj = new LongBar(250, 100, Color.yellow);
		board.getJFrame().addKeyListener(tObj);
		int count = 0;
		while(true){
			count++;
			if(count % 30 == 0)
				tObj.moveDown();
			
			board.clear();
			tObj.draw(g);
			board.repaint();
			
			timer.pause(30);
			
		}
		
	}
	
	
}


