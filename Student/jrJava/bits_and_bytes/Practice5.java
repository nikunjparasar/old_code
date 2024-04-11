package jrJava.bits_and_bytes;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0b01101011;
		int b = a >> 3;
		
		printBinary(a);
		System.out.println();
		printBinary(b);
		
	}
	public static void printBinary(int value) {
		String binaryString = Integer.toBinaryString(value);
		for(int i=0; i<32-binaryString.length(); i++) {
			System.out.print('0');
		}
		System.out.println(binaryString);
	}
}
