package jrJava.practice15_usingThis;

public class XYZ {

	public int aaa;
	public boolean bbb;
	
	public void mmA(int aaa, boolean bbb) {
		this.aaa = aaa;
		this. bbb = bbb;
	}
	
	public double mmB(int aaa) {
		return 0.5*(this.aaa*aaa);
	}
}
