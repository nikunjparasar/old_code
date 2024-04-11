package jrJava.tetris_step_5_properBurial;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;


import resources.DrawingBoard;
import resources.SoundPlayer;
import resources.Timer;

public class Coordinator {

	public static int score;
	public static boolean gameOver;
	public static final int GAME_OVER_Y = 150;
	
	public static final String PATH = "jrJava/tetris_sounds/";
	private static Color[] colorMenu = { Color.RED, Color.BLUE, Color.GREEN, Color.PINK,
			                             Color.ORANGE, Color.MAGENTA, Color.CYAN, Color.YELLOW };
	
	
	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(200, 0, 500, 700);
		Graphics g = board.getCanvas();
		Timer timer = new Timer();
		
		TetrisObject tObj = createTetrisObject();
		
		board.getJFrame().addKeyListener(tObj); 
		
		SoundPlayer bgSound = new SoundPlayer(PATH + "imperialMarch.wav");
		bgSound.playLoop(); 
		
		int count = 0;
		while(!gameOver) {
			count++;
			
			board.clear();
			Graveyard.draw(g);
			
			if(count%30==0) tObj.moveDown();
			tObj.draw(g); 
			g.setColor(Color.BLACK);
			g.drawString("Score = " + score , 40, 30);
			
			if(tObj.toBeBuried()) {
				tObj.bury();
				board.getJFrame().removeKeyListener(tObj); 
				
				tObj = createTetrisObject();
				
				board.getJFrame().addKeyListener(tObj); 
			}
			
			board.repaint(); 
			
			timer.pause(30); 
		} 
		bgSound.stop();
		
		g.setColor(Color.BLACK);
		Font gameOverFont = new Font("Times", Font.BOLD, 80);
		g.setFont(gameOverFont);
		g.drawString("GAME OVER", 5, 300);
		board.repaint();
		
		
		/*Image gameOverImage = new ImageIcon(PATH + "gameOver.png").getImage();
		g.drawImage(gameOverImage, 0,200,null);
		board.repaint();*/
	}

	
	private static TetrisObject createTetrisObject() {
		Color color = colorMenu[ (int)(Math.random()*colorMenu.length) ];
		
		TetrisObject ref;
		double rand = Math.random();
		if(rand<1/7.0) ref = new Bar(240, 100, color);
		else if(rand<2/7.0) ref = new BlockShape(240, 100, color);
		else if(rand<3/7.0) ref = new Cross(240, 100, color);
		else if(rand<4/7.0) ref = new LongBar(240, 100, color);
		else if(rand<5/7.0) ref = new LShape(240, 100, color);
		else if(rand<6/7.0) ref = new OddShape(240, 100, color);
		else ref = new UShape(240, 100, color);
		
		return ref;
	}
	
}




 




