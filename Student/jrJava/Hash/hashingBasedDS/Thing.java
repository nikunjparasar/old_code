package jrJava.hashingBasedDS;

public class Thing {

	private int id;
	private int b;
	private int c;
	
	
	public Thing(int id) {
		super();
		this.id = id;
	}
	
	
	public Thing(int id, int b, int c) {
		super();
		this.id = id;
		this.b = b;
		this.c = c;
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Thing)) return false;
		Thing other = (Thing) o;
		return id == other.id;
	}
	
	public int hashCode() {
		return id;
	}
	
	public String toString() {
		return "[" + id + ", " + b + ", " + c + "]";
	}
}
