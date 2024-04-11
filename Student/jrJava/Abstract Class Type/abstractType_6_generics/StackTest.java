package jrJava.abstractType_6_generics;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStack<Integer> stack = new MyStack<Integer>(5);
		
		stack.push(123);
		stack.push(45);
		stack.push(-55);
		stack.push(1000);
		
		while(!stack.isEmpty()) {
			Integer each = stack.pop();
			System.out.println(each);
		}
		
	}

}
