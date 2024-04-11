package jrJava.linkedList5_notSorted;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.insertAtBeginning("aaa");
		list.insertAtBeginning("bbb");
		list.insertAtBeginning("ccc");
		list.insertAtEnd("ddd");
		
		Iterator<String> iter = new MyIterator<String>(list);
		while(iter.hasNext()) {
			String each = iter.next();
			System.out.println(each);
			if(each.indexOf('c')>=0) iter.remove();
		}
		
		System.out.println();
		
		iter = new MyIterator<String>(list);
		while(iter.hasNext()) {
			String each = iter.next();
			System.out.println(each);
		}
		
	}

}






