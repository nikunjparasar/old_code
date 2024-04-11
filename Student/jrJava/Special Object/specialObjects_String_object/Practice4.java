package jrJava.specialObjects_String_object;

public class Practice4 {

	public Practice4() {
		// TODO Auto-generated constructor stub
	}

	
	//trim(), toUpperCase(),toLowerCase(), replace(seq1,seq2)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String exp1 = "  Harry  Potter ";
		String exp2 = exp1.trim();
		System.out.println(exp2);
		
		String exp3 = exp2.toUpperCase();
		System.out.println(exp3);
		
		String exp4 = exp2.toLowerCase();
		System.out.println(exp4);
		
		String exp = "Tim1 Tim2 Tim3 Tim4";
		System.out.println(exp.replace("Tim", "YY"));
		System.out.println(exp.replace('i', 'o'));
		
		
		
		
	}

}
