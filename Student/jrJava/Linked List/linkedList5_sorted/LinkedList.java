package jrJava.linkedList5_sorted;

public class LinkedList<E extends Comparable<E>> {

	public Link<E> first;
	
	public LinkedList() { }
	
	public boolean isEmpty() {
		return first==null;
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
	
	
	public E removeFirst() {
		Link<E> temp = first;
		if(first!=null) first = first.next;
		return temp.obj;
	}
	
	
	public E removeEnd() {
		if(first==null) return null; // empty
		
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
			link.next = current;
			previous.next = link;
		}
			
	}
	
	
	
}














