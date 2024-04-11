package jrJava.linkedList2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insert(7, 7.0);
		list.insert(4, 4.0);
		list.insert(3, 3.0);
		list.insert(6, 6.0);
		list.insert(5, 5.0);
		list.insert(1, 1.0);
		
		while(list.hasNext()) {
			Link each = list.next();
			System.out.println(each);
			if(each.id==3) list.remove();
		}
		
		list.printAll();
		
		
		//list.printAll();
		
		/*
		while(list.hasNext()) {
			Link each = list.next();
			System.out.println(each);
		}
		*/
		
		
		
		
		
		/*
		while(list.hasNext()) {
			Link link1 = list.next();
			while(list.hasNext()) {
				Link link2 = list.next();
				System.out.println(link1 + ", " + link2);
			}
		}
		*/
		
	
		 
	} 

}








