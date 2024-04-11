package jrJava.specialObjects_6_wrapperClass;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a1 = new Integer(253);
		//Integer a1 = 253;
		
		int a3= a1.intValue();
		//int a3 = a1;
		System.out.println(a3);
		
		Double d1 = new Double(3.1415);
		//Double d1 = 3.1415;
		double d3 = d1.doubleValue();
		//double d3 = d1;
		
		
		
		//
		//Wrapper class also have many useful static methods.
		//
		
		//351 --> "351"	  String.valueOf(351);
		//"351" --> 351   Integer.parseInt("351");
		
		
		String s1 = "111";
		String s2 = "222";
		System.out.println(s1+s2);
		System.out.println(Integer.parseInt(s1)+ Integer.parseInt(s2));
		
		
		String s3 = "3.33";
		String s4 = "4.44";
		System.out.println(s3+s4);
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));
		
		
	}
}
