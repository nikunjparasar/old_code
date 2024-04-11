package jrJava.abstractType_arrayList;

public class ObjectA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyArrayList list = new MyArrayList();
		list.add(new Ball(1,1));
		list.add(new Ball(2,2));
		list.add(new Ball(3,3));
		
		
		ObjectB.doTheJob(list);
		
	}

}
