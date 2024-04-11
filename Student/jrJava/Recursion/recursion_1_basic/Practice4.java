package jrJava.recursion_1_basic;

public class Practice4 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mmm(0,100);
	}

	
	public static void mmm(int a, int b) {
		
		//if(a>1000) return;
		int c = a+b;
		System.out.println(c);
		
		a++;
		
		mmm(a, b);
		
	}
	
	
}
