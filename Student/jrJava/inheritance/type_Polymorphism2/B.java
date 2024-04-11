package jrJava.type_Polymorphism2;

public class B extends A {

	public int f =20;
	public static int fS = 2000;
	
	public static void mS() {
		System.out.println("B's m()" + fS);
	}
	
	public void m1() {
		System.out.println("B's m1()" + f +", "+ fS);
	}
	
	public void m2() {
		System.out.println("B's m2()" + f + ", "+fS);
		super.m2();
	}
}
