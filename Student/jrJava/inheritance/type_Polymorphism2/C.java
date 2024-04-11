package jrJava.type_Polymorphism2;

public class C extends B{

	public int f =30;
	public static int fS = 3000;
	
	public static void mS() {
		System.out.println("C's m()" + fS);
	}
	
	public void m1() {
		System.out.println("C's m1()" + f +", "+ fS);
	}
	
	public void m2() {
		System.out.println("C's m2()" + f + ", "+fS);
		super.m2();
	}
}
