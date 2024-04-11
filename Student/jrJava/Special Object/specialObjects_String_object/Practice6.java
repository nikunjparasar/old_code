package jrJava.specialObjects_String_object;

public class Practice6 {

	//substring(begin, end) --> [begin, end-1] will not include the char at the end
	//substring(begin) --> [begin, end] begin to the rest of the string

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exp = "I love you sir.";
		
		String piece1 = exp.substring(7, 10);
		System.out.println(piece1);
		
		String piece2 = exp.substring(7);
		System.out.println(piece2);
	}

}
