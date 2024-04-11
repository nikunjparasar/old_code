package jrJava.abstractType_queue_CircularArray;

public class MyQueue {
	private Object[] elements;
	
	private int front, rear ,size;
	
	public MyQueue(int size) {
		elements = new Object[size];
		front = -1;
		rear = 0;
		this.size = 0;
	}
	
	public void enqueue(Object ref) {
		if(size == elements.length) throw new IndexOutOfBoundsException();
		
		front++;
		if(front == elements.length) front = 0;
		elements[front] = ref;
		size++;
	}
	
	public Object dequeue() {
		if(size == 0) throw new IndexOutOfBoundsException();
		
		Object temp = elements[rear];
		elements[rear] = null;
		rear++;
		if(rear == elements.length) rear = 0;
		size--;
		return temp;
	}
	
	public Object peek() {
		if(size == 0) throw new IndexOutOfBoundsException();
		return elements[rear];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	//DELETE LATER FOR DEVELOPMENT ONLY
	public void printAll() {
		for(int i =0; i<elements.length; i++) System.out.print(elements[i] + " "); System.out.println();
	}
}
