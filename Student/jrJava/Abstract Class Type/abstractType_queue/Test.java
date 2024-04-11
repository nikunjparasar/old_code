package jrJava.abstractType_queue;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyQueue q = new MyQueue(10);
		
		q.enqueue("aaa");
		q.enqueue("bbb");
		q.enqueue("ccc");
		q.enqueue("ddd");
		q.enqueue("eee");
		q.enqueue("fff");
		q.enqueue("ggg");
	
		q.printAll();
		
		while(!q.isEmpty()) {
			
			System.out.println(q.dequeue());
		}
		System.out.println(q.peek());
	}

}
