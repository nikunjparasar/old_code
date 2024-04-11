package jrJava.practice17_static_nonStatic;

import java.awt.Graphics;
import java.awt.Color;
import resources.DrawingBoard;

public class Circle {

	public  DrawingBoard board;
	public Color color;
	public int x, y;
	public int dx,dy;
	public static int radius;
	public static int number;
	
	
	public Circle() {
		number++;
	}

	public static void grow(int x) {
		radius += x;
	}
	
	public static void shrink() {
		radius -= 5;
	}
	
	public Circle(DrawingBoard Board, Color Color, int X, int Y, int Dx, int Dy ) {
		number++;
		
		this.board = Board;
		this.color = Color;
		this.x = X;
		this.y = Y;
		this.dx = Dx;
		this.dy = Dy;
	}
	
	public void draw() {
			
			Graphics g = board.getCanvas();
			g.setColor(color);
			g.drawOval(x-radius, y-radius, 2*radius, 2*radius);
			board.repaint();
			radius++;
		}
	
	public void move() {
		x += dx;
		y += dy;
	}
	
}
