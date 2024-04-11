package jrJava.abstractType_arrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyArrayList list = new MyArrayList();
		
		System.out.println(list.size());
		
		list.add(new Ball(1,1));
		list.add(new Ball(2,2));
		list.add(new Ball(3,3));
		System.out.println(list.size());
		
		System.out.println(list.get(0));
		System.out.println(list);
		list.spillTheGut();
		list.add(1, new Ball(4,4));
		list.add(1, new Ball(5,5));
		list.spillTheGut();
		list.add(1,new Ball(6,6));
		list.spillTheGut();
		list.add(1, new Ball(7,7));
		System.out.println(list);
	}

}
