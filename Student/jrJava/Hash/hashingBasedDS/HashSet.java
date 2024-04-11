package jrJava.hashingBasedDS;

import java.util.Iterator;

public class HashSet<E> {

	private Entry<E>[] entries;
	
	public HashSet(int size) {
		entries = new Entry[size];
	}
	
	
	public HashSet() {
		this(100);
	}
	
	
	public E add(E obj) {
		
		// 1. Create a new entry that contains the 'obj'.
		Entry<E> entry = new Entry<E>(obj);
		
		// 2. Make it arrive at the right hashBucket.
		int index = obj.hashCode()%entries.length;
		Entry<E> p = entries[index];
		
		// 3. Traverse to the end of the hashBucket (linked List)
		//    while traversing, check any duplicate entry.
		
		if(p==null) {
			entries[index] = entry;
			return null;
		}
		else if(p.obj.equals(obj)) {
			 entry.next = p.next;
			 entries[index] = entry;
			 return p.obj;
		}
		
		Entry<E> c = p.next;
		
		while(c!=null) {
			
			if(c.obj.equals(obj)) {
				entry.next = c.next;
				p.next = entry;
				return c.obj;
			}
			
			p = c;
			c = c.next;
		}
		
		p.next = entry;
		return null;
	}
	 
	
	
	public E get(E searchKey) {
		int index = searchKey.hashCode()%entries.length;
		Entry<E> c = entries[index];
		
		while(c!=null) {
			if(c.obj.equals(searchKey)) return c.obj;
			c = c.next;
		}
		
		return null;
	}
	
	
	
	public void display() {
		Entry<E> c;
		for(int i=0; i<entries.length; i++) {
			System.out.print(i + ": ");
			c = entries[i];
			
			while(c!=null) {
				System.out.print(c.obj + " -> ");
				c = c.next;
			}
			System.out.println();
		}
		
	}
	
	
	public Iterator<E> iterator() {
		return new IterImpl();
	}
	
	
	private class IterImpl implements Iterator<E> {
		
		private int nextIndex = 0;
		private Entry<E> next = entries[nextIndex];
		
		public boolean hasNext() {
			
			while(next==null) {
				nextIndex++;
				if(nextIndex>=entries.length) break;
				next = entries[nextIndex];
			}
			
			return next!=null;
		}
		
		
		public E next() {
			E toBeReturned = next.obj;
			next = next.next;
			return toBeReturned;
		}
	}
	
	
	
	private static class Entry<E> {
		
		public E obj;
		public Entry<E> next;
		
		public Entry(E obj) {
			this.obj = obj;
		}
		
	}
	
}




