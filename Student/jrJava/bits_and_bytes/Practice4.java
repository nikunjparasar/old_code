package jrJava.bits_and_bytes;

public class Practice4 {
	public static void main(String[] args) {
//		int a = 1234567890;
//		int b = 4444444;
//		int c = a ^ b;
//		
//		printBinary(a);
//		printBinary(b);
//		printBinary(c);
	
		int a = 15;
		int b = ~a;
	
		printBinary(a);
		printBinary(b);
		
		int p = 3124565;
		int q = ~p +1;
		System.out.println(q);//negative of p
	}	
	public static void printBinary(int value) {
		String binaryString = Integer.toBinaryString(value);
		for(int i=0; i<32-binaryString.length(); i++) {
			System.out.print('0');
		}
		System.out.println(binaryString);
	}
}
