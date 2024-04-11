package jrJava.specialObjects_7_binary_hexadecimal;

public class Practice4 {



	public static void main(String[] args) {
		
		//careful!
		int a = 2078142017;
		int b = a +501267808;
		System.out.println(b);
		
		//max+1 = min
		System.out.println(Integer.MAX_VALUE+1 == Integer.MIN_VALUE);
		
		//0 = a + ~a +1 
		//-a = ~a + 1
		a = 24325;
		System.out.println(a +~a +1);
		
	}

}
