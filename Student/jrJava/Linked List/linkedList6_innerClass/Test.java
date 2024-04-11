package jrJava.linkedList6_innerClass;

import java.util.Iterator;


public class Test {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.insertAtEnd("aaa");
		list.insertAtEnd("bbb");
		list.insertAtEnd("ccc");
		list.insertAtEnd("ddd");

		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String each = iter.next();
			System.out.println(each);
		}
		
	}

}
 



