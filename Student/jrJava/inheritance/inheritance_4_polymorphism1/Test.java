package jrJava.inheritance_4_polymorphism1;

public class Test {

	public static void main(String[] args) {
		
		A ref1 = new A();
		ref1.mA();
		
		A ref2 = new B();
		ref2.mA();
		
		A ref3 = new C();
		ref3.mA();
	}

}
