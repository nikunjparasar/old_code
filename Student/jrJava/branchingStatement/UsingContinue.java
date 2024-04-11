package jrJava.branchingStatement;

public class UsingContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//continue statement: used in loop structure.
		
		//Approach 1
		int sum1 = 0;
		for(int i = 1; i<=100; i++) {
			if(i == 50)continue;
			System.out.println(i);
			sum1+= i*i;
		}
		
		System.out.println(sum1);
		
		
		
		//Approach 2
		int sum2 = 0;
		for(int i = 1; i<=100; i++) {
			if(i != 50) {
				System.out.println(i);
				sum2+= i*i;
			}
		}
		
		System.out.println(sum2);
		
		
		
		
		
	}

}
