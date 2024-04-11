package jrJava.practice13_scope;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a = 10;
		if (true) {
			int a = 5;// cannot do this. it still sees the previous a.
			System.out.println(a);
			
		}
		System.out.println(a);
		*/
		
		/*
		if (true) {
			int a = 10;
			System.out.println(a);
			
		}
		int a = 10;
		System.out.println(a);
		
		//this one is fine
}
*/
		/*
		int i; 
		for (i = 6; i<=10; i++) {
			
		}
		*///cannot do
		
		/*
		
		for (int i = 6; i<=10; i++) {
			
		}
		int i; // this is fine, the previous i is already destroyed
		for (i = 6; i<=10; i++) {
			
		}
		*/
	}
}