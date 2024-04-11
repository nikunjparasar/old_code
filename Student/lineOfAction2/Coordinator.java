package jrJava.lineOfAction2;

import java.awt.Color;
import java.awt.Graphics;

public class Coordinator {

	public static boolean gameOver;
	public static int winner;
	
	public static void main(String[] args) {
		
		MyDrawingBoard board = new MyDrawingBoard(500, 100, 500, 500);
		Graphics g = board.getBufferedG();

		GameBoard gameBoard = new GameBoard(g);
		
		board.addMouseListener(gameBoard);
		board.addMouseMotionListener(gameBoard);
		
		while(!gameOver) {
			if(winner!=0) gameOver = true;
			
			board.clear();
			gameBoard.draw();
			board.repaint();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) { }
		}
		
		board.removeMouseListener(gameBoard);
		board.removeMouseMotionListener(gameBoard);
		
		g.setColor(Color.BLACK);
		g.drawString("Game Over", 50, 50);
		board.repaint();
	}

}




