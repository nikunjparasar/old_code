package jrJava.abstractType_6_generics;

public class MyStack<E> {

	private E[] elements;
	private int top;
	
	public MyStack(int size) {
		elements = (E[])new Object[size];
		top = -1;
	}
	
	public void push(E ref) {
		if(top == elements.length-1) throw new IndexOutOfBoundsException();
		
		elements[++top] = ref;
	
		
	}
	
	public E pop() {
		if(isEmpty()) throw new IndexOutOfBoundsException();
		return elements[top--];
		
		
	}
	
	public E peek() {
		if(isEmpty()) throw new IndexOutOfBoundsException();

		return elements[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
}
