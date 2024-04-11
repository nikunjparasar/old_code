package jrJava.lineOfAction3;

import java.awt.Color;
import java.awt.Graphics;

public class Coordinator {

	public static boolean gameOver;
	public static int winner;
	public static boolean humanPlayerTurn;
	
	public static final int HUMAN_TURN = 1;
	public static final int COMPUTER_TURN = -1;
	
	
	public static void main(String[] args) {
		
		MyDrawingBoard board = new MyDrawingBoard(500, 100, 500, 500);
		Graphics g = board.getBufferedG();

		GameBoard gameBoard = new GameBoard(g);
		
		board.addMouseListener(gameBoard);
		board.addMouseMotionListener(gameBoard);
		
		AIPlayer AI = new AIPlayer(gameBoard);
		gameBoard.setTurn(HUMAN_TURN); 
		humanPlayerTurn = true;
		
		int countAfterTurnChange = 0;
		
		while(!gameOver) {
			if(winner!=0) gameOver = true;
			
			board.clear();
			gameBoard.draw();
			board.repaint();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) { }
			
			if(!humanPlayerTurn) {
				countAfterTurnChange++;
				if(countAfterTurnChange>1) {
					AI.makeMove();
					humanPlayerTurn = true;
					countAfterTurnChange = 0;
				}
			}
		}
		
		board.removeMouseListener(gameBoard);
		board.removeMouseMotionListener(gameBoard);
		
		g.setColor(Color.BLACK);
		if(winner==HUMAN_TURN) g.drawString("Human won!", 50, 50);
		else if(winner==COMPUTER_TURN) g.drawString("AI won!", 50, 50);
		board.repaint();
	}

}




