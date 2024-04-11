package jrJava.linkedList4_sorted;

public class Link {

	public Link next;
	public Comparable obj;
	
	
	public Link(Comparable obj) {
		this.obj = obj;
	}
	
	
	public String toString() {
		return obj.toString();
	}
	
	
	public boolean equals(Object o) {
		if(!(o instanceof Link)) return false;
		Link other = (Link) o;
		return obj.equals(other.obj);
	}
	
}





