package jrJava.type_Polymorphism2;

public class A {
		public int f =10;
		public static int fS = 1000;
		
		public static void mS() {
			System.out.println("A's m()" + fS);
		}
		
		public void m1() {
			System.out.println("A's m1()" + f + ", " + fS);
		}
		
		public void m2() {
			System.out.println("A's m2()" + f + ", " + fS);
			mS();
			m1();
		}
}
