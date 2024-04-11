package jrJava.tetris_step_3_rotation_mirror;

public class Graveyard {
	
	private static final int X_LEFT;
	private static final int Y_TOP;
	private static final int X_RIGHT;
	private static final int Y_BOTTOM;
	private static int cols, rows;
	
	static {
		cols = 20;
		rows = 30;
		X_LEFT = 40;
		Y_TOP = 40;
		X_RIGHT = X_LEFT + cols*Block.SIZE;
		Y_BOTTOM = Y_TOP+rows*Block.SIZE; 		
		
	}
	
}
