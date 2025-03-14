package jrJava.tetris_1;

import java.awt.Color;

public class UShape extends TetrisObject {

	public UShape(int x, int y, Color color) {
		super(x, y, color);
	}

	protected void formShape() {
		blocks = new Block[5];
		blocks[0] = new Block(-1, 0, color);
		blocks[1] = new Block(0, 0, color);
		blocks[2] = new Block(1,0, color);
		blocks[3] = new Block(-1, 1, color);
		blocks[4] = new Block(1, 1, color);
		
		updateBlocks();
	}
	
}
