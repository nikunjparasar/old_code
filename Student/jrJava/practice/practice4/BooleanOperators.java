package jrJava.practice4;

public class BooleanOperators {

	public static void main(String[] args) {
		
		// !(NOT) operator:
		
		//boolean a = 100>50;
		//boolean b = !a;
		//System.out.println("a=" + a);
		//System.out.println("b=" + b);
		
		boolean a = !(100>50);
		boolean b =!a;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		// &&(AND) operator:
		
		int x = 100;
		boolean c = x>50 && x<120;
		System.out.println("c=" + c);
		boolean d = x>50 && x<90;
		System.out.println("d=" + d);
		boolean e = x>50 && x<150 && x==99;
		System.out.println("e=" + e);
		boolean f = x>50 && x<150 && x!=99;
		System.out.println("f=" + f);
		
		// ||(OR) operator:
		int y = 15;
		boolean k = y<16 || y>21;
		System.out.println("k=" + k);
		boolean m = y<12 || y>21;
		System.out.println("m=" + m);
		boolean n = y==100 || y!=100; // for all y values, this will be true.
		System.out.println("n=" + n);
		
	}

}









