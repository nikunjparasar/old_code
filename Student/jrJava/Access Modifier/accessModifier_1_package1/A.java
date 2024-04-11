package jrJava.accessModifier_1_package1;

public class A {
	
	private int a1 = 11;
	int a2 = 22;
	public int a3 = 33;
	protected int a4 = 44;
	
	
	private void mA1() {
		System.out.println(a1);
	}
	
	void mA2() {
		System.out.println(a2);
	}
	
	public void mA3() {
		System.out.println(a3);
	}
	
	protected void mA4() {
		System.out.println(a4);
	}
	
	public void diff(A o) {
		int diff = a1 - o.a1;
		System.out.println(diff);
	}
}
