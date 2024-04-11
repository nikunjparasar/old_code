package jrJava.abstractType_stack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStack s = new MyStack(5);
		s.push("AAAA");
		s.push("BBBB");
		s.push("CCCC");
		s.push("DDDD");
		s.push("EEEE");
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		
		System.out.println();
		retrieve(s);
		
		
	}

	public static void retrieve(MyStack stack) {
		MyStack s = new MyStack(10);
		while(!stack.isEmpty()) {
			s.push(stack.pop());
		}

		while(!s.isEmpty())
			System.out.println(s.pop());
		}
}
