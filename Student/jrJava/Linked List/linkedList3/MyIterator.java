//package jrJava.linkedList3;
//
//import java.util.Iterator;
//
//public class MyIterator implements Iterator {
//
//	private LinkedList list;
//	private Link current, previous;
//	
//	
//	public MyIterator(LinkedList list) {
//		this.list = list;
//	}
//	
//	
//	public boolean hasNext() {
//		if(current==null) return list.first!=null;
//		return current.next!=null;
//	}
//	
//	public Link next() {
//		if(current==null) {
//			current = list.first;
//			return current;
//		}
//		previous = current;
//		current = current.next;
//		return current;
//	}
//	
//	
//	public void remove() {
//		if(current==null) throw new UnsupportedOperationException("removal op"); 
//		
//		if(previous==null) {
//			list.first = list.first.next;
//			current = null;
//			return;
//		}
//		previous.next = current.next;
//		current = previous;
//	}
//	
//}
