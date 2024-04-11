package jrJava.practice15_approach3;

import java.awt.Graphics;
import java.awt.Color;
import resources.DrawingBoard;

public class Circle {

	public  DrawingBoard board;
	public Color color;
	public int x, y, radius;
	public int dx,dy;
	
	public Circle() {}

	public Circle(DrawingBoard Board, Color Color, int X, int Y, int Radius, int Dx, int Dy ) {
		
		System.out.println("In Circle():" + this);
		this.board = Board;
		this.color = Color;
		this.x = X;
		this.y = Y;
		this.radius = Radius;
		this.dx = Dx;
		this.dy = Dy;
	}
	
	public void draw() {
			
			Graphics g = board.getCanvas();
			g.setColor(color);
			g.drawOval(x-radius, y-radius, 2*radius, 2*radius);
			board.repaint();
		}
	
	public void move() {
		x += dx;
		y += dy;
	}
	
}
