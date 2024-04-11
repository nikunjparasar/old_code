package jrJava.linkedList2;

public class Test1 {

	public static void main(String[] args) {
		/*
		int[] aaa = {35, 15, 17, 88, 25};
		
		for(int i=0; i<aaa.length; i++) {
			System.out.println(aaa[i] + " ");
		}
		
		int i, j;
		for(i=0; i<aaa.length; i++) {
			for(j=0; j<aaa.length; j++) {
				System.out.println(aaa[i] + ", " + aaa[j]);
			}
		}
		*/
		
		LinkedList list = new LinkedList();
		
		list.insertAtEnd(35, 0.35);
		list.insertAtEnd(15, 0.15);
		list.insertAtEnd(17, 0.17);
		list.insertAtEnd(88, 0.88);
		list.insertAtEnd(25, 0.25);
		
		
		for(int i=0; i<list.size(); i++) {
			Link each = list.get(i);
			System.out.println(each);
			if(each.id==456) list.remove(456);
		}
		
		int i, j;
		for(i=0; i<list.size(); i++) {
			for(j=0; j<list.size(); j++) {
				System.out.println(list.get(i) + ", " + list.get(j));
			}
		} 
		
		
	}  

}







