package jrJava.inheritance_1_basic;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object obj = new Object();
		Object obj2 = new Object();

		boolean isEqual = obj.equals(obj2);
		Class theClass = obj.getClass();
		int unique = obj.hashCode();
		String description = obj.toString();
		
		
		System.out.println(isEqual);
		System.out.println(theClass);
		System.out.println(unique);
		System.out.println(description);
	}

}
