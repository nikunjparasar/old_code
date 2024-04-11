package jrJava.memoryCard_4_gameLogic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import resources.SoundPlayer;

public class GameBoard extends JPanel implements MouseListener {

	public static final int NUM_OF_CARDS = 42;
	public static final int NUM_OF_COLS = 7;
	public static final int MARGIN = 20;
	private static boolean gameOver;
	
	private static SoundPlayer tick, buzz, chime;
	
	
	private Card[] cards;
	
	private boolean noneSelected = true;	
	private boolean oneSelected;
	private boolean twoSelected;
	private Card firstSelected, secondSelected;
	
	private long lastTimeTwoCardsSelected;
	private JFrame frame;
	private int score;
	
	static {
		tick = new SoundPlayer("jrjava/memoryCard_1/tick.wav");
		buzz = new SoundPlayer("jrjava/memoryCard_1/buzz.wav");
		chime = new SoundPlayer("jrjava/memoryCard_1/chime.wav");
	}
	
	
	public GameBoard() {
		
		frame = new JFrame("Memory Card Game");
		frame.setBounds(200, 0, 800, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		frame.add(this);
		this.addMouseListener(this);
		
		cards = new Card[NUM_OF_CARDS];
		for(int i =0; i< cards.length; i++) {
			cards[i] = new Card(i/2, MARGIN + i%NUM_OF_COLS * Card.SIZE, MARGIN + i/NUM_OF_COLS * Card.SIZE);
			
		}
		for(int i = 0; i<cards.length; i++) {
			cards[i].swapImages(cards[(int)(Math.random()*cards.length)]);
		}
		frame.setVisible(true); 
	}
	
	 
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_RENDERING, 
				RenderingHints.VALUE_RENDER_QUALITY);
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		for(int i=0; i<cards.length; i++) cards[i].draw(g);
	}
	
	public void showAll() {
		for(int i =0; i<cards.length; i++) {
			cards[i].show();
		}
	}
	public void hideAll() {
		for(int i =0; i<cards.length; i++) {
			cards[i].hide();
		}
		
	}
	
	
	
	public void mousePressed(MouseEvent e) {
				
		for(int i = 0; i<cards.length; i++) {
			
			
			
			if(!cards[i].hasBeenMatched() && cards[i].isSelected(e.getX(), e.getY ())) {
				
				
				if(noneSelected) {
					noneSelected = false;
					oneSelected = true;
					firstSelected = cards[i];
					firstSelected.show();
					tick.play();
				}
				
				else if(oneSelected) {
					if(cards[i] == firstSelected) return;
					oneSelected = false;
					twoSelected = true;
					secondSelected = cards[i];
					secondSelected.show();
					lastTimeTwoCardsSelected = System.currentTimeMillis();
					tick.play();
				}
				break;
			}
		}
		repaint();
	}
		
	
	
	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	
	public void applyGameRule() {
		if(!twoSelected || System.currentTimeMillis() -lastTimeTwoCardsSelected <2000) return;
	
		if(firstSelected.matchedWith(secondSelected) && !(firstSelected.equals(secondSelected)) ) {
			twoSelected = false;
			noneSelected = true;
			firstSelected.setMatched();
			secondSelected.setMatched();
			score += 30;
			frame.setTitle("Score:" + score);
			chime.play();
			
			
			boolean isGameOver = true;
			for(int i = 0; i<cards.length; i++) {
				if(!cards[i].hasBeenMatched()) {
					isGameOver = false;
					break;
				}
			}
			if(isGameOver) {
				frame.setTitle("GAME OVER!");
				gameOver = true;
			}
			
		}
		else {
			firstSelected.hide();
			secondSelected.hide();
			buzz.play();
		}
		
		twoSelected = false;
		noneSelected = true;
		firstSelected = null;
		secondSelected = null;

		repaint();
	}
	
	
	public static void main(String[] args) {
		GameBoard gameBoard = new GameBoard();
		gameBoard.showAll();
		gameBoard.repaint();
		
		try {Thread.sleep(3000);} 
		catch (InterruptedException e1) {	}
		
		gameBoard.hideAll();
		gameBoard.repaint();
		
		while(!gameOver) {
			
			
			//gameBoard.repaint();
			
			gameBoard.applyGameRule();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) { }
		}
		
	}


	
	
}




