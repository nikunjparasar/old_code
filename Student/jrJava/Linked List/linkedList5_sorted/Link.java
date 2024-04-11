package jrJava.linkedList5_sorted;

public class Link<T> {

	public Link<T> next;
	public T obj;
	
	
	public Link(T obj) {
		this.obj = obj;
	}
	
	
	public String toString() {
		return obj.toString();
	}
	
	
	public boolean equals(Object o) {
		if(!(o instanceof Link)) return false;
		Link<T> other = (Link<T>) o;
		return obj.equals(other.obj);
	}
	
}





