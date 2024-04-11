package jrJava.specialObjects_String_object;

public class Practice7 {

	public static void main(String[] args) {
		
		int aaa = 241;
		double bbb = 3.1415;
		boolean ccc = true;
		
		//We want to crate string objects that will contain the primitive type data
		//Such as"241" "3.1415" "true"
		
		String str1 = String.valueOf(aaa);
		String str2 = String.valueOf(bbb);
		String str3 = String.valueOf(ccc);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
	}

}
