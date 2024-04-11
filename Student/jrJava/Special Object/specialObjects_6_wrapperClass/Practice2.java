package jrJava.specialObjects_6_wrapperClass;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		int a = 4507;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toHexString(a));
		
		for(int i= 0; i<20; i++) {
			System.out.println(Integer.toBinaryString(i));
		}
		
		for(int i= 0; i<257; i++) {
			System.out.println(Integer.toHexString(i));
		}
	}

}
