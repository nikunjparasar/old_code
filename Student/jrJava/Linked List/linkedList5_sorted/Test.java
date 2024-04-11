package jrJava.linkedList5_sorted;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.insert("ddd");
		list.insert("bbb");
		list.insert("aaa");
		list.insert("eee");
		list.insert("ccc");
		//list.insert(new Ball());
		
		Iterator<String> iter = new MyIterator<String>(list);
		while(iter.hasNext()) {
			String each = (String) iter.next();
			System.out.println(each);
			if(each.indexOf("cc")>=0) iter.remove();
		}
		
		System.out.println();
		
		iter = new MyIterator<String>(list);
		while(iter.hasNext()) {
			String each = (String) iter.next();
			System.out.println(each);
		}
	}
}




