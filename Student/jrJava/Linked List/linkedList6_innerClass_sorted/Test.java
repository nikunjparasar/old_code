package jrJava.linkedList6_innerClass_sorted;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.insert("ccc");
		list.insert("bbb");
		list.insert("ddd");
		list.insert("eee");
		list.insert("aaa");
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String each = iter.next();
			System.out.println(each);
			if(each.indexOf("cc")>=0) iter.remove();
		}
		
		iter = list.iterator();
		while(iter.hasNext()) {
			String each = iter.next();
			System.out.println(each);
		}
		
	}

}
 



