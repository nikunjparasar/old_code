package jrJava.barbarianAttack2;

import java.awt.Image;

public class FlyingBarbarian extends Barbarian {

	protected int upperLimit, lowerLimit;
	protected int direction;
	
	public FlyingBarbarian(Image[] images, int x, int y, int vx, int flySpan) {
		super(images, x, y, vx);
		upperLimit = y + flySpan;
		lowerLimit = y - flySpan;
		direction = 1;
	}
	
	public void move() {
		x += vx;
		if(x>1100) Coordinator.gameOver = true;
	
		y += direction*Math.random()*5;
		if(y>=upperLimit) {
			y = upperLimit;
			direction *= -1;
		}
		if(y<=lowerLimit) {
			y = lowerLimit;
			direction *= -1;
		}
	}
}




