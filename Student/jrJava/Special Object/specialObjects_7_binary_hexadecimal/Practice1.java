package jrJava.specialObjects_7_binary_hexadecimal;

public class Practice1 {

	public static void main(String[] args) {
		
		int a = 0b110011;
		System.out.println(a);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toHexString(a));
		
		int b = 0xf5c;
		System.out.println(b);
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toHexString(b));
		
		
	}

}
