package jrJava.tetris_step_2_keyListener;


import java.awt.Color;
import java.awt.Graphics;


public class Block {

	public static int SIZE = 20;
	private int xRel, yRel;
	private int x, y;
	private Color color;
	
	public Block(int xRel, int yRel, Color color){
		this.xRel = xRel;
		this.yRel = yRel;
		this.color = color;
	}
	
	public void updatePosition(int tetrisX, int tetrisY) {
		x = tetrisX + xRel*SIZE;
		y = tetrisY + yRel*SIZE;
	}
	
	
	public void draw(Graphics g){
		g.setColor(color);
		g.fillRect(x, y, SIZE, SIZE);
		g.setColor(Color.black);
		g.drawRect(x, y, SIZE, SIZE);
	}
	
}
