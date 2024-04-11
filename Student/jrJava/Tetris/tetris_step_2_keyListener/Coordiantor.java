package jrJava.tetris_step_2_keyListener;

import resources.*;
import java.awt.*;

public class Coordiantor {

	
	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(500, 600);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();
		
		TetrisObject tObj = new LShape(250, 100, Color.yellow);
		board.getJFrame().addKeyListener(tObj);
		
		while(true){
			tObj.moveDown();
			
			board.clear();
			tObj.draw(g);
			board.repaint();
			
			timer.pause(900);
		}
		
	}
	
	
}


