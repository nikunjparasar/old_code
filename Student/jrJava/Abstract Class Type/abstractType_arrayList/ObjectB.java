package jrJava.abstractType_arrayList;

public class ObjectB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	public static void doTheJob(MyArrayList list) {
		Ball ball = new Ball(2,2);
		boolean result = list.remove(ball);
		System.out.println(result);
	}

}
