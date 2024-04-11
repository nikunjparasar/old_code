package jrJava.accessModifier2_package2;

import jrJava.accessModifier_1_package1.A;

public class XYZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aaa = new A();
		
		//System.out.println(aaa.a1);
		//System.out.println(aaa.a2);//package
		System.out.println(aaa.a3);
		
		//aaa.mA1();
		//aaa.mA2();//package
		aaa.mA3();
		
	}

}
