package jrJava.linkedList1;

public class LinkedList {

	private Link first;
	
	public LinkedList() { }
	
	
	public boolean isEmpty() {
		return first==null;
	}
	
	
	public void insertAtBeginning(int id, double value) {
		Link link = new Link(id, value);
		link.next = first;
		first = link;	
	}
	
	
	public void insertAtEnd(int id, double value) {
		Link link = new Link(id, value);
		
		if(first==null) {
			first = link;
			return;
		}
		
		Link current = first;
		while(current.next!=null) {
			current = current.next;
		}
		
		current.next = link;
	}
	
	
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
	
	
	
	public Link removeFirst() {
		Link temp = first;
		if(first!=null) first = first.next;
		return temp;
	}
	
	
	public Link removeEnd() {
		if(first==null) return null;
		
		Link current = first;
		Link previous = null;
		
		while(current.next!=null) {
			previous = current;
			current = current.next;
		}
		
		if(previous==null) first = null;
		else previous.next = null;
		
		return current;
	}
	
	
	
	public Link remove(int id) {
		if(first==null) return null;
		
		Link current = first;
		Link previous = null;
		
		while(current.id!=id) {
			previous = current;
			current = current.next;
			if(current==null) return null;
		}
		
		if(previous==null) first = first.next;
		else previous.next = current.next;
		
		return current;
	}
	
	
	public int size() {
		int count = 0;
		Link current = first;
		while(current!=null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	
	public void printAll() {
		Link current = first;
		
		while(current!=null) {
			System.out.print(current + " "); 
			current = current.next;
		}
		System.out.println();
	}
	
	
}

