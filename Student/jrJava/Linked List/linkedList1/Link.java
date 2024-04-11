package jrJava.linkedList1;


public class Link {

	public Link next;
	public int id;
	public double value;
	
	public Link(int id, double value) {
		this.id = id;
		this.value = value;
	}
	
	public String toString() {
		return "[" + id + ", " + value + "]";
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Link)) return false;
		Link other = (Link) o;
		return id==other.id;
	}
	
}


