package jrJava.abstractType_6_generics;

public class MyQueue <E> {
	private E[] elements;
	
	private int front, rear ,size;
	
	public MyQueue(int size) {
		elements = (E[]) new Object[size];
		
		front = -1;
		rear = 0;
		this.size = 0;
	}
	
	public void enqueue(E ref) {
		if(size == elements.length) throw new IndexOutOfBoundsException();
		
		front++;
		if(front == elements.length) front = 0;
		elements[front] = ref;
		size++;
	}
	
	public E dequeue() {
		if(size == 0) throw new IndexOutOfBoundsException();
		
		E temp = elements[rear];
		elements[rear] = null;
		rear++;
		if(rear == elements.length) rear = 0;
		size--;
		return temp;
	}
	
	public E peek() {
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
