package jrJava.linkedList4;


public class LinkedList<E> {

	public Link<E> first;
	
	public LinkedList() { }
	
	public boolean isEmpty() {
		return first==null;
	}
	
	
	public void insertAtBeginning(E obj) {
		Link<E> link = new Link<E>(obj);
		link.next = first;
		first = link;	
	}
	
	
	public void insertAtEnd(E obj) {
		Link<E> link = new Link<E>(obj);
		
		if(first==null) {
			first = link;
			return;
		}
		
		Link<E> current = first;
		while(current.next!=null) {
			current = current.next;
		}
		
		current.next = link;
	}
	
	/*
	// If only this insert(...) method is used,
	// the linkedList will be sorted-linkedList.
	public void insert(int id, double value) {
		
		Link link = new Link(id, value);
		
		Link current = first;
		Link previous = null;
		
		while(current!=null && current.id<id) {
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
	*/
	
	
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
	
	
	public void printAll() {
		Link<E> current = first;
		
		while(current!=null) {
			System.out.print(current + " "); 
			current = current.next;
		}
		System.out.println();
	}
	
	
}








