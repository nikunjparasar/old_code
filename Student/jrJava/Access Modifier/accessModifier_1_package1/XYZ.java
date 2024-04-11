package jrJava.accessModifier_1_package1;

public class XYZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aaa = new A();
		
		//System.out.println(aaa.a1);
		System.out.println(aaa.a2);
		System.out.println(aaa.a3);
		//System.out.println(a4);//protected
		
		//aaa.mA1();
		aaa.mA2();
		aaa.mA3();
		//aaa.mA4();// protected
		
	}

}
