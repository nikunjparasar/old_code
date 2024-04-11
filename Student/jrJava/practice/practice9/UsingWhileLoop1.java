package jrJava.practice9;

public class UsingWhileLoop1 {

	
	public static void main(String[] args) {
		
		// 1*1*1 + 2*2*2 + 3*3*3 + ... + 100*100*100

		// Uing a for-loop:
		/* 
		int sum = 0;
		
		int i;
		for(i=1; i<=100; i++) {
			sum += i*i*i;
		}
		
		System.out.println("sum = " + sum); 
		*/
		
		
		// Using while-loop:
		
		int sum = 0;
		
		int i;
		i = 1;  // like the first field of for-loop.
		while(i<=100) {
		
			sum += i*i*i;
			
			i++;  // like the third field of for-loop.
		}
		
		System.out.println("sum = " + sum);
	}

} 









