package jrJava.type_Polymorphism;

public class A {
		public int f =10;
		
		public void mA() {
			System.out.println("A's mA()");
		}
		
		public void m() {
			System.out.println("A's m()");
			m();
		}
}
