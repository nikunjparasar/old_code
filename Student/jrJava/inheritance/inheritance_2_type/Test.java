package jrJava.inheritance_2_type;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C ref1 = new C();
		ref1.mC();
		System.out.println(ref1);
		
		B ref2 = new C();
		//ref2.mC();
		
		A ref3 = new C();
		//ref3.mB();
		
		Object ref4 = new C();
		//ref4.mA();
		
		
	}

}
