package jrJava.practice15_approach3;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;

public class Square {

	public DrawingBoard board;
	public Color color;
	public int x, y, side;
	public int dx,dy;
	
	public Square() {}
	public Square(DrawingBoard Board, Color Color, int X, int Y, int Side, int Dx, int Dy ) {
		this.board = Board;
		this.color = Color;
		this.x = X;
		this.y = Y;
		this.side = Side;
		this.dx = Dx;
		this.dy = Dy;
	}
	public void draw() {
			
			Graphics g = board.getCanvas();
			g.setColor(color);
			g.drawRect(x, y, side, side);
			board.repaint();
	}
	public void move() {
		x += dx;
		y += dy;
	}
}
