
package jrJava.abstractType_arrayList;

public class Ball {
	private int x;
	private int y;
	
	public Ball(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double getDistance() {
		return Math.sqrt(x*x +y*y);
	}
	
	public String toString() {
		return "[" + x + "," + y + "]";
	}
	//you need to override the equals method
	public boolean equals(Object o) {
		if(!(o instanceof Ball)) return false;
		Ball other = (Ball)o;
		return x== other.x && y == other.y;
	}
}
