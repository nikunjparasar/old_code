package jrJava.maze_1;

import java.awt.Graphics;

import resources.DrawingBoard;

public class Coordinator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawingBoard board = new DrawingBoard(200, 0, 600, 600);
		Graphics g = board.getCanvas();
		Mouse mouse = new Mouse(25, 25, 30, 1, 0);
		board.getJFrame().addKeyListener(mouse);
		
		
		
		new Thread(mouse).start();
		
		while(true) {
			board.clear();
			mouse.draw(g);
			board.repaint();
			try {
				Thread.sleep(50);;
			}catch(InterruptedException e){}
			
		}
		
	}

}
