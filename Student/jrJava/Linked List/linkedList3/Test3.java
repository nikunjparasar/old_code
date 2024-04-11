//package jrJava.linkedList3;
//
//import java.util.Iterator;
//
//public class Test3 {
//
//	public static void main(String[] args) {
//		
//		LinkedList list = new LinkedList();
//		list.insert(5,  5.0);
//		list.insert(9,  9.0);
//		list.insert(4,  4.0);
//		list.insert(2,  2.0);
//		list.insert(8,  8.0);
//		list.insert(7,  7.0);
//		list.insert(3,  3.0);
//		list.insert(6,  6.0);
//		
//		Iterator iter1 = new MyIterator(list);
//		Iterator iter2 = new MyIterator(list);
//		
//		AdditionOp additionOp = new AdditionOp(iter1);
//		RemovalOp removalOp = new RemovalOp(iter2, 4);
//		
//		for(int i=0; i<20; i++) {
//			additionOp.process();
//			removalOp.process();
//		}
//		
//		list.printAll();
//	}
//
//}
//
//
//
