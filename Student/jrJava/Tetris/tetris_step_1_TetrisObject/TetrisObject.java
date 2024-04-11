package jrJava.tetris_step_1_TetrisObject;

import java.awt.*;
import java.util.*;
import resources.*;


public abstract class TetrisObject {
	
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
	
	
	public void moveDown(){
		y += Block.SIZE;
		for(int i=0; i<blocks.length; i++) {
			blocks[i].updatePosition(x, y);
		}
	}
	
	
	public void draw(Graphics g){
		for(int i=0; i<blocks.length; i++){
			blocks[i].draw(g);
		}
	}
 
}
