package jrJava.barbarianAttack3;

import java.util.Iterator;

public class LinkedList<E> {

	public Link<E> first;
	
	public void insert(E obj) {
		Link<E> link = new Link<E>(obj);
		link.next = first;
		first = link;	
	}
	
	
	public Iterator<E> iterator() {
		return new MyIterator();
	}
	
	
	private class MyIterator implements Iterator<E> {

		private Link<E> current, previous;
		
		public boolean hasNext() {
			if(current==null) return first!=null;
			return current.next!=null;
		}
		
		public E next() {
			if(current==null) {
				current = first;
				return current.obj;
			}
			previous = current;
			current = current.next;
			return current.obj;
		}
		
		
		public void remove() {
			if(current==null) throw new UnsupportedOperationException("removal op"); 
			
			if(previous==null) {
				first = first.next;
				current = null;
				return;
			}
			previous.next = current.next;
			current = previous;
		}
		
	}
	
	
	private static class Link<T> {

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
}








