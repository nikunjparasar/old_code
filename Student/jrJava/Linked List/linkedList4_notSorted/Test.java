package jrJava.linkedList4_notSorted;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insertAtBeginning("aaa");
		list.insertAtBeginning("bbb");
		list.insertAtBeginning("ccc");
		list.insertAtEnd("ddd");
		
		Iterator iter = new MyIterator(list);
		while(iter.hasNext()) {
			//String each = (String) iter.next();
			Integer each = (Integer) iter.next();
			System.out.println(each);
		}
	}

}
