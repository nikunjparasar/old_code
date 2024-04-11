package jrJava.barbarianAttack2;

import java.awt.Graphics2D;

public class ArrowManager {

	private static MyArrayList<Arrow> arrows = new MyArrayList<Arrow>();
	
	
	public static void add(Arrow arrow) {
		arrows.add(arrow);
	}
	
	public static void remove(Arrow arrow) {
		arrows.remove(arrow);
	}
	
	public static void move() {
		Arrow each;
		for(int i=arrows.size()-1; i>=0; i--) {
			each = arrows.get(i);
			each.move();
			if(each.getX()<0 || each.getY()>650) arrows.remove(i);
		}
	}
	
	
	public static void draw(Graphics2D g) {
		for(int i=0; i<arrows.size(); i++) arrows.get(i).draw(g);
	}
	
}



