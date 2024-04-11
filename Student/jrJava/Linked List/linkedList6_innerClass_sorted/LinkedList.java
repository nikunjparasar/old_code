package jrJava.linkedList6_innerClass_sorted;

import java.util.Iterator;

public class LinkedList<E extends Comparable<E>> {

	public Link<E> first;
	
	public LinkedList() { }
	
	public boolean isEmpty() {
		return first==null;
	}
	
	
	
	// If only this insert(...) method is used,
	// the linkedList will be sorted-linkedList.
	public void insert(E obj) {
		
		Link<E> link = new Link<E>(obj);
		
		Link<E> current = first;
		Link<E> previous = null;
		
		while(current!=null && current.obj.compareTo(obj)<0) {
			previous = current;
			current = current.next;
		}
		
		if(previous==null) {
			link.next = first;
			first = link;
		}
		else {
			previous.next = link;
			link.next = current;
		}
	}
	
	
	
	public E removeFirst() {
		Link<E> temp = first;
		if(first!=null) first = first.next;
		return temp.obj;
	}
	
	
	public E removeEnd() {
		if(first==null) return null;
		
		Link<E> current = first;
		Link<E> previous = null;
		
		while(current.next!=null) {
			previous = current;
			current = current.next;
		}
		
		if(previous==null) first = null;
		else previous.next = null;
		
		return current.obj;
	}
	
	
	
	public E remove(E obj) {
		if(first==null) return null;
		
		Link<E> current = first;
		Link<E> previous = null;
		
		while(!current.obj.equals(obj)) {
			previous = current;
			current = current.next;
			if(current==null) return null;
		}
		
		if(previous==null) first = first.next;
		else previous.next = current.next;
		
		return current.obj;
	}
	
	
	public int size() {
		int count = 0;
		Link<E> current = first;
		while(current!=null) {
			count++;
			current = current.next;
		}
		return count;
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
	
	
	private static class Link<E> {

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
			Link<E> other = (Link<E>) o;
			return obj.equals(other.obj);
		}
		
	}
	
}








