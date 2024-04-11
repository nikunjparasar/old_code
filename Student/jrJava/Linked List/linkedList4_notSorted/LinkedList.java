package jrJava.linkedList4_notSorted;

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
	
	
	public void insertAtBeginning(Object obj) {
		Link link = new Link(obj);
		link.next = first;
		first = link;
	}
	
	
	public Object removeFirst() {
		Link temp = first;
		if(first!=null) first = first.next;
		return temp.obj;
	}
	
	
	public Object removeEnd() {
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
	
	
	
	public Object remove(Object obj) {
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
	
	
	
	public void insertAtEnd(Object obj) {
		Link link = new Link(obj);
		
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
	

}














