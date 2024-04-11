package jrJava.abstractType_6_generics;

import java.util.StringTokenizer;

public class Ball implements Comparable<Ball> {

	private int x;
	private int y;
	private int radius;
	private double distance;
	
	
	public Ball(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
		distance = Math.sqrt(x*x + y*y);
	}

	
	public Ball(String line) {
		// 13, 10, 109
		StringTokenizer st = new StringTokenizer(line, ", ");
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		radius = Integer.parseInt(st.nextToken());
		distance = Math.sqrt(x*x + y*y);
	}
	
	

	public int getX() { return x;  }
	public int getY() { return y; }
	public int getRadius() { return radius; }
	public double getDistance() { return distance; }
	
	
	public int compareTo(Ball o) {
		Ball other = (Ball) o;
		if(radius>other.radius) return 1;
		else if(radius<other.radius) return -1;
		else return 0;
		
	
	}
	
	
	public String toString() {
		return "[x=" + x + ", y=" + y + ", radius=" + radius + ", dist=" + (int)(distance*1000)/1000.0 + "]";
	}
	
	
	public boolean equals(Object o) {
		if(!(o instanceof Ball)) return false; // we will talk about this.
		Ball b = (Ball) o; // we will talk about this.
		return x==b.x && y==b.y && radius==b.radius;
	}
	
	
	public int hashCode() {
		return x + 100*y + 10000*radius; // we will talk about this.
	}



	
}






