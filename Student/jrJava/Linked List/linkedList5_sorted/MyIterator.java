package jrJava.linkedList5_sorted;

import java.util.Iterator;

public class MyIterator<E extends Comparable<E>> implements Iterator<E> {

	private LinkedList<E> list;
	private Link<E> current; // null, one before the 'first'.
	private Link<E> previous;
	
	
	public MyIterator(LinkedList<E> list) {
		this.list = list;
	}
	
	public boolean hasNext() {
		if(current==null) return list.first!=null;
		return current.next!=null;
	}
	
	public E next() {
		if(current==null) {
			current = list.first;
			return current.obj;
		}
		previous = current;
		current = current.next;
		return current.obj;
	}
	
	public void remove() {
		if(current==null) throw new UnsupportedOperationException("removal-op");
		
		if(previous==null) {
			list.first = list.first.next;
			current = null;
			return;
		}
		previous.next = current.next;
		current = previous;
	}
}
