package jrJava.branchingStatement;

public class UsingBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// break statement: use only in loop and switch
		
		int sum1 = 0;
		for (int i = 1; i<=100; i++) {
			sum1 += i^2;
			if(sum1 >200000) {break;}
		}
		
		System.out.println(sum1);
	
	
		boolean shouldContinue = true;
		int sum2 = 0;
		for (int i = 1; i<=100 && shouldContinue; i++){
			sum2 += i*i;
			if(sum2>200000) {shouldContinue = false;}
		}
		
		
		
		
		
		
		
	}
	
	

}
