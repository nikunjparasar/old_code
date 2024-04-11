package jrJava.barbarianAttack4;

import java.util.Iterator;

public class LinkedList<E> {

	private Link<E> first;
	private Pool<E> pool;
	
	public LinkedList() {
		pool = new Pool<E>();
	}
	
	public E recycle() {
		if(pool.isEmpty()) return null;
		Link<E> link = pool.remove();
		link.next = first;
		first = link;
		return link.obj;
	}

	
	
	public void insert(E obj) {
		Link<E> link = new Link<E>(obj);
		link.next = first;
		first = link;	
	}
	
	
	public void printAll() {
		Link<E> current = first;
		while(current != null) {
			System.out.print(current+ " ");
			current = current.next;
		}
		//System.out.println();
		System.out.print("-----");
		pool.printAll();
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
				Link<E> temp = first;
				first = first.next;
				current = null;
				pool.insert(temp);
				return;
			}
			Link<E> temp = current;
			previous.next = current.next;
			current = previous;
			pool.insert(temp);
		}
		
	}
	
	
	private class Pool<A> {
		
		private Link<A> first;
		
		public boolean isEmpty() {
			return first==null;
		}
		
		public Link<A> remove() {
			Link<A> temp = first;
			if(first!=null) first = first.next;
			return temp;
		}
		
		public void insert(Link<A> link) {
			link.next = first;
			first = link;
		}
		
		public void printAll() {
			Link<A> current = first;
			while(current != null) {
				System.out.print(current + " ");
				current = current.next;
			}
			System.out.println();
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








