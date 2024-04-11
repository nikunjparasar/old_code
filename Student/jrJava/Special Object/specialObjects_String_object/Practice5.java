package jrJava.specialObjects_String_object;

public class Practice5 {

	public Practice5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "tim1 tom2 tam3 tum4";
		System.out.println(exp.replaceAll("t[ao]m", "abc"));
		System.out.println(exp.replaceAll("t[a-j]m", "abc"));
		
		System.out.println(exp.replaceAll("m[23]", "MMM"));
		System.out.println(exp.replaceAll("m[0-9]", "MMM"));
		System.out.println(exp.replaceAll("m[^23]", "MMM"));
		
		String exp2 = "tim1 tac2 toe3 tum4";
		System.out.println(exp2.replaceAll("t[iou][aume][1-4] ", "tommy "));
		
		String exp3 = "I   have  a    book.";
		System.out.println(exp3.replaceAll("  *", " "));
		System.out.println(exp3.replaceAll(" +", " "));
	}

}
