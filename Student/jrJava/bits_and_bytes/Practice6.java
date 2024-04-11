package jrJava.bits_and_bytes;

public class Practice6 {
	public static void main(String[] args) {
		int a = -1014432356;
		printBinary(a);
		
		int b = a >> 3;
		System.out.println();
		
		printBinary(b);
		
		int c = a >>> 3;
		printBinary(c);
		
	}
	public static void printBinary(int value) {
		String binaryString = Integer.toBinaryString(value);
		for(int i=0; i<32-binaryString.length(); i++) {
			System.out.print('0');
		}
		System.out.println(binaryString);
	}
}
