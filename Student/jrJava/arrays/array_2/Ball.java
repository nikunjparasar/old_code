package jrJava.array_2;

public class Ball {
	
	public int x;
	public int y;
	public Ball(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public double getDistance(){
		return Math.sqrt(x*x +y*y);
	}
	
}
