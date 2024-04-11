package jrJava.abstractType_queue_CircularArray;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue q = new MyQueue(8);
		
		q.printAll();
		
		q.enqueue("AAAA");
		q.enqueue("BBBB");
		q.enqueue("CCCC");
		q.enqueue("DDDD");
		q.enqueue("EEEE");
		q.enqueue("FFFF");
		q.enqueue("GGGG");
		q.enqueue("HHHH");
		
		q.printAll();
		
		q.dequeue();
		q.dequeue();
		q.enqueue("IIII");
		q.printAll();
	}

}
