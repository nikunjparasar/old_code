package jrJava.barbarianAttack4;

import java.awt.Graphics2D;
import java.util.Iterator;

public class ArrowManager {

	//private static MyArrayList<Arrow> arrows = new MyArrayList<Arrow>();
	private static LinkedList<Arrow> arrows = new LinkedList<Arrow>();
	
	public static int arrowId = 0;
	
	public static void create(double x, double y, double vx, double vy, double length) {

		Arrow recycled = arrows.recycle();
		if(recycled != null) {
			recycled.reset(x, y, vx, vy, length);
			
		}
		else {
			arrows.insert(new Arrow(x, y, vx, vy, length));
		}
	}
	
	
	
	public static void move() {
		Iterator<Arrow> iter = arrows.iterator();
		Arrow each;
		while(iter.hasNext()) {
			each = iter.next();
			each.move();
			if(each.getX()<0 || each.getY()>650) iter.remove();
		}
		arrows.printAll();
	}
	
	
	public static void draw(Graphics2D g) {
		Iterator<Arrow> iter = arrows.iterator();
		Arrow each;
		while(iter.hasNext()) {
			each = iter.next();
			each.draw(g); 
			if(each.isCollided()) iter.remove();
		}
	}
	
}

 





