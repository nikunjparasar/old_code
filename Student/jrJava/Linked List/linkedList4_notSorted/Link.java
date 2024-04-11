package jrJava.linkedList4_notSorted;

public class Link {

	public Link next;
	public Object obj;
	
	
	public Link(Object obj) {
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





