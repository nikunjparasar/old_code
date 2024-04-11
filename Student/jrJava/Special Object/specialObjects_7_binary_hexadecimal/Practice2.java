package jrJava.specialObjects_7_binary_hexadecimal;

public class Practice2 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 41;	// --> ?*2^6 + ?*2^5 + ?*2^4 + ?*2^3 + ?*2^2 + ?*2^1 +?*2^0
		System.out.println(Integer.toBinaryString(a));
		
		int b = 892; // --> ?*16^3 + ?*16^2 + ?*16^1 + ?*16^0
		System.out.println(Integer.toHexString(b));
	}

}
