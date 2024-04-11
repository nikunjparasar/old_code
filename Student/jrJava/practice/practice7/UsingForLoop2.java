package jrJava.practice7;

public class UsingForLoop2 {

	public static void main(String[] args) {
		
		// What seems to be problem with the followings?
		int i;
		for(i=1; i>10; i++) {
			System.out.println("i=" + i);
		}
		
		for(i=1; i<10; i--) {
			System.out.println("i=" + i);
		}
		
		for(i=10; i<=1; i--) {
			System.out.println("i=" + i);
		}
		
		for(i=10; i<=20; i--) {
			System.out.println("i=" + i);
		}
	}

}
