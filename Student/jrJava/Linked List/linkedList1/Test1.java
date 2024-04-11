package jrJava.linkedList1;

public class Test1 {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		//System.out.println(list.size());
		
		//list.insertAtBeginning(1,  1.1);
		//list.insertAtBeginning(2,  2.2);
		//list.insertAtBeginning(3,  3.3);
		
		//list.insertAtEnd(1,  1.1);
		//list.insertAtEnd(2,  2.2);
		//list.insertAtEnd(3,  3.3);
		
		//System.out.println(list.removeFirst());
		//System.out.println(list.removeFirst());
		//System.out.println(list.removeFirst());
		
		//while(!list.isEmpty()) {
		//	System.out.println(list.removeFirst());
		//}
		
		
		//list.insertAtEnd(1,  1.1);
		//list.insertAtEnd(2,  2.2);
		
		//list.printAll();
		
		//System.out.println(list.removeEnd());
		//System.out.println(list.removeEnd());
		//System.out.println(list.removeEnd());
		
		//list.insert(10, 10.0);
		
		list.insert(5,  5.0);
		list.insert(7,  7.0);
		list.insert(2,  2.0);
		list.insert(1,  1.0);
		list.insert(3,  3.0);
		
		list.printAll();
		
		Link removed = list.remove(2);
		list.printAll();
	} 

}







