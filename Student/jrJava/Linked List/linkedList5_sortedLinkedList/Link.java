package jrJava.linkedList5_sortedLinkedList;


public class Link<E> {

	public Link<E> next;
	public E obj;
	
	public Link(E obj) {
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






