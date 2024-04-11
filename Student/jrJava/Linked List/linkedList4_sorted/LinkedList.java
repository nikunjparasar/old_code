package jrJava.linkedList4_sorted;

public class LinkedList {

	public Link first;
	
	public LinkedList() { }
	
	public boolean isEmpty() {
		return first==null;
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
	
	
	public Comparable removeFirst() {
		Link temp = first;
		if(first!=null) first = first.next;
		return temp.obj;
	}
	
	
	public Comparable removeEnd() {
		if(first==null) return null; // empty
		
		Link current = first;
		Link previous = null;
		
		while(current.next!=null) {
			previous = current;
			current = current.next;
		}
		
		if(previous==null) first = null;
		else previous.next = null;
		
		return current.obj;
	}
	
	
	
	public Comparable remove(Comparable obj) {
		if(first==null) return null;
		
		Link current = first;
		Link previous = null;
		
		while(!current.obj.equals(obj)) {
			previous = current;
			current = current.next;
			if(current==null) return null;
		}
		
		if(previous==null) first = first.next;
		else previous.next = current.next;
		
		return current.obj;
	}
	
	
	public void insert(Comparable obj) {
		Link link = new Link(obj);
		
		Link current = first;
		Link previous = null;
		
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














