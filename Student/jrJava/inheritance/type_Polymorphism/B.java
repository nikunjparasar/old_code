package jrJava.type_Polymorphism;

public class B extends A {

	//public int f =20;
	
	public void mB() {
		System.out.println("B's mB()");
	}
	
	public void mA() {
		System.out.println("B's mA()");
	}
	
	public void m() {
		System.out.println("B's m()");
		super.m();
	}
}
