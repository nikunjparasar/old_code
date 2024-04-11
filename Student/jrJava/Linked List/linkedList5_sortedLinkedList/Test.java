package jrJava.linkedList5_sortedLinkedList;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.insert("ccc");
		list.insert("bbb");
		list.insert("ddd");
		list.insert("eee");
		list.insert("aaa");
		
		Iterator<String> iter = new MyIterator<String>(list);
		while(iter.hasNext()) {
			String each = iter.next();
			System.out.println(each);
			if(each.indexOf("cc")>=0) iter.remove();
		}
		
		iter = new MyIterator<String>(list);
		while(iter.hasNext()) {
			String each = iter.next();
			System.out.println(each);
		}
		
	}

}
 



