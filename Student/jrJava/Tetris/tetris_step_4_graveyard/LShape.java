package jrJava.tetris_step_4_graveyard;

import java.awt.Color;

public class LShape extends TetrisObject {

	public LShape(int x, int y, Color color) {
		super(x, y, color);
	}

	protected void formShape() {
		blocks = new Block[4];
		blocks[0] = new Block(-2, 0, color);
		blocks[1] = new Block(-1, 0, color);
		blocks[2] = new Block(0, 0, color);
		blocks[3] = new Block(0, 1, color);
		
		updateBlocks();
	}
	
}
