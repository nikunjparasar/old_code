package jrJava.inheritance_1_basic;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B bbb = new B();
		System.out.println(bbb.b);
		bbb.mB();
		
		System.out.println(bbb.a);
		bbb.mA();
		
		C ccc = new C();
		System.out.println(ccc.c);
		System.out.println(ccc.b);
		System.out.println(ccc.a);
		ccc.mC();
		ccc.mB();
		ccc.mA();
		
	}

}
