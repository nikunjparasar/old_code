package jrJava.practice6;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import resources.DrawingBoard;

public class ManualControl {

	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(400, 400);
		Graphics g = board.getCanvas();
		Scanner scanner = new Scanner(System.in);
		
		int x = 150;
		int y = 150;
		int command;
		
		board.clear();
		g.setColor(Color.BLUE);
		g.fillOval(x, y, 100, 100);
		board.repaint();
		
		int i;
		for(i=1; i<=100; i++){
			
			System.out.println("Enter command. 1(left), 2(right), 3(up), 4(down):");
			command = scanner.nextInt();
			
			if(command==1) {
				x -= 10;
			}
			else if(command==2) {
				x += 10;
			}
			else if(command==3) {
				y -= 10;
			}
			else if(command==4) {
				y += 10;
			}
			
			board.clear();
			g.setColor(Color.BLUE);
			g.fillOval(x, y, 100, 100);
			board.repaint();
		}
		
	}

}
