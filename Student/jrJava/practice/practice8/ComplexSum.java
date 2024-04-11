package jrJava.practice8;

public class ComplexSum {

	public static void main(String[] args) {
		
		// (1) + (1+2) + (1+2+3) + (1+2+3+4) + ... (1+2+3+...+100)
		
		int sum = 0;
		
		int i, j;
		for(i=1; i<=5; i++) {
			for(j=1; j<=i; j++) {
				sum += j;
			}
		}
		System.out.println("sum=" + sum); 
		
		
		// (100) + (100+99) + (100+99+98) + ... + (100+99+98+...+1)
	
	}

	
	
}
