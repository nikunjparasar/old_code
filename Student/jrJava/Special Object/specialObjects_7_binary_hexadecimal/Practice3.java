package jrJava.specialObjects_7_binary_hexadecimal;

public class Practice3 {


	public static void main(String[] args) {
	

		//printFullBinary();
	}
	public static void printFullBinary(int value) {
		String binaryString = Integer.toBinaryString(value);
		for(int i = 0; i<32-binaryString.length(); i++) {
			System.out.print('0');			
		}
		System.out.println(binaryString);
		
	}
	
}
