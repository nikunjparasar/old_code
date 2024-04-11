package jrJava.abstractType_6_generics;

public class QueueTest {
	public static void main(String[] args) {
		MyQueue<String> q = new MyQueue<String>(5);
		
		q.enqueue("aaa");
		q.enqueue("bbb");
		q.enqueue("ccc");
		q.enqueue("ddd");

		while(!q.isEmpty()) {
			String each = q.dequeue();
			System.out.println(each);
		}
		
	}
}
