package jrJava.usingHashCode1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(101, "ABC");
		int hashCode = s.hashCode();
		
		System.out.println(Integer.toHexString(hashCode));
		System.out.println(s);
	}

}
