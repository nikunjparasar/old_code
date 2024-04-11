package jrJava.nestedClass5;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		DirtyArray da = new DirtyArray(10);
		Iterator<String> iter = da.iterator();
		
		while(iter.hasNext()) {
			String each = iter.next();
			System.out.println(each); 
			if(each.indexOf("School")>=0) iter.remove();
		}
		
		System.out.println();
		
		iter = da.iterator();
		while(iter.hasNext()) {
			String each = iter.next();
			System.out.println(each); 
		}
		
	}

}
