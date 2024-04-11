package jrJava.recursion_1_basic;

public class Practice2 {
	
	private static int f;
	
	public static void main(String[] args) {
		m1(0);
		System.out.println(f);
	}
	
	public static void m1(int a) {
		a++;
		f+=2;
		System.out.println("Welcome a = " + a);
		if(a>=3)return;
		int b = 100;
		m2(a);
		int c = 555;
		System.out.println("Good bye a = " + a);
	}
	
	public static void m2(int a) {
		a++;
		f+=2;
		System.out.println("Welcome a = " + a);
		if(a>=3)return;
		//int b = 100;
		m3(a);
		//int c = 555;
		System.out.println("Good bye a = " + a);
	}
	public static void m3(int a) {
		a++;
		f+=2;
		System.out.println("Welcome a = " + a);
		if(a>=3)return;
		//int b = 100;
		//**
		//int c = 555;
		System.out.println("Good bye a = " + a);
	}
}
