package jrJava.linkedList4_sorted;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert("ddd");
		list.insert("bbb");
		list.insert("aaa");
		list.insert("eee");
		list.insert("ccc");
		//list.insert(new Ball());
		
		Iterator iter = new MyIterator(list);
		while(iter.hasNext()) {
			String each = (String) iter.next();
			System.out.println(each);
		}
	}
}
