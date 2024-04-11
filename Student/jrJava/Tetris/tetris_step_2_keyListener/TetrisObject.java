package jrJava.tetris_step_2_keyListener;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public abstract class TetrisObject implements KeyListener {

	protected Block[] blocks;
	protected int x;
	protected int y;
	protected Color color;


	public TetrisObject(int x, int y, Color color){
		this.x = x;
		this.y = y;
		this.color = color;

		formShape();
	}

	protected abstract void formShape();

	
	protected void updateBlocks() {
		for(int i=0; i<blocks.length; i++) {
			blocks[i].updatePosition(x, y);
		}
	}

	public void moveDown(){
		y += Block.SIZE;
		updateBlocks();
	}

	private void shiftLeft() {
		x -= Block.SIZE;
		updateBlocks();
	}
	
	private void shiftRight() {
		x += Block.SIZE;
		updateBlocks();
	}
	
	private void rotate() { }
	

	public void draw(Graphics g){
		for(int i=0; i<blocks.length; i++){
			blocks[i].draw(g);
		}
	}

	
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		if(keyCode==KeyEvent.VK_LEFT) shiftLeft();
		else if(keyCode==KeyEvent.VK_RIGHT) shiftRight();
	}
	

	public void keyTyped(KeyEvent e) { }

	public void keyReleased(KeyEvent e) { }
}





