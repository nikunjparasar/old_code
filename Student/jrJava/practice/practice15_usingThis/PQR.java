package jrJava.practice15_usingThis;

public class PQR {

	public static int aaa;
	public static boolean bbb;
	
	public static void mmA(int aaa, boolean bbb) {
		PQR.aaa = aaa;
		PQR.bbb = bbb;
	}
	
	public double mmb(int aaa) {
		return 0.5*(PQR.aaa + aaa);
	}
	
}
