package jrJava.abstractType_queue;

public class MyQueue {
	private Object[] elements;
	private int  front;
	
	
	public MyQueue(int size) {
		elements = new Object[size];
		front = -1;
	}
	
	public void enqueue(Object ref) {
		if(front == elements.length-1) throw new IndexOutOfBoundsException();
		
		elements[++front] =ref;
		
	}
	
	public Object dequeue() {
		if(isEmpty()) throw new IndexOutOfBoundsException();
		Object temp = elements[0];
		for(int i = 1; i<=front ;i++) {
			elements[i-1] = elements[i];
		}
		front--;
		return temp;
		
		
	}
	public Object peek() {
		if(isEmpty()) throw new IndexOutOfBoundsException();
		return elements[0];
	}
	
	public boolean isEmpty() {
		return front == -1;
	}

	//DELETE THIS LATER. ONLY FOR DEVELOPMENT
	public void printAll() {
		for(int i =0; i<elements.length; i++) {
			System.out.print(elements[i]+" , ");
			
		}
		System.out.println("");
	}
	
	
}
