package jrJava.linkedList4;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		/*
		LinkedList list = new LinkedList();
		
		list.insertAtEnd("aaa");
		list.insertAtEnd("bbb");
		list.insertAtEnd("ccc");
		list.insertAtEnd("ddd");

		Iterator iter = new MyIterator(list);
		while(iter.hasNext()) {
			Integer each = (Integer) iter.next();
			System.out.println(each);
		}
		*/
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.insertAtEnd("aaa");
		list.insertAtEnd("bbb");
		list.insertAtEnd("ccc");
		list.insertAtEnd("ddd");

		Iterator<String> iter = new MyIterator<String>(list);
		while(iter.hasNext()) {
			String each = iter.next();
			System.out.println(each);
		}
		
	}

}
 



