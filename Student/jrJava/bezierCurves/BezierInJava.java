package jrJava.bezierCurves;

import java.awt.*;
import java.awt.geom.GeneralPath;

import resources.DrawingBoard;

public class BezierInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawingBoard board = new DrawingBoard(800, 700);
		Graphics2D g = (Graphics2D) board.getCanvas();
		GeneralPath path = new GeneralPath();
		
//		path.moveTo(100.0,  100.0);
//		path.lineTo(200.0, 200.0);
//		path.lineTo(200.0, 300.0);
		
		path.moveTo(100.0,  100.0);
		path.quadTo(300.0, 50.0, 200.0,  200.0);
		path.lineTo(200.0,  300.0);
		path.curveTo(100.0, 300.0, 200.0, 100.0, 100.0, 100.0);
		
		path.moveTo(300.0, 300.0);
		path.curveTo(800.0, 100.0, 500.0, 500.0, 500.00, 600.0);
		
		g.setColor(Color.RED);
		g.fill(path);
		
	}

}
