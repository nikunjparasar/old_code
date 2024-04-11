package jrJava.abstractType_stack;

public class MyStack {

	private Object[] elements;
	private int top;
	
	public MyStack(int size) {
		elements = new Object[size];
		top = -1;
	}
	
	public void push(Object ref) {
		if(top == elements.length-1) throw new IndexOutOfBoundsException();
		
		elements[++top] = ref;
	
		
	}
	
	public Object pop() {
		if(isEmpty()) throw new IndexOutOfBoundsException();
		return elements[top--];
		
		
	}
	
	public Object peek() {
		if(isEmpty()) throw new IndexOutOfBoundsException();

		return elements[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
}
