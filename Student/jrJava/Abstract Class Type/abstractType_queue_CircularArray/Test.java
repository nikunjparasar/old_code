package jrJava.abstractType_queue_CircularArray;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyQueue q = new MyQueue(5);
		
		q.enqueue("AAAA");
		q.enqueue("BBBB");
		q.enqueue("CCCC");
		q.enqueue("DDDD");
		
		while(!q.isEmpty()) {
			System.out.println(q.dequeue());
		}
	}

}
