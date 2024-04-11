package jrJava.recursion_3_issueWithRecursion;

public class Practicee2_Fibonacci_wo_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long startTime = System.currentTimeMillis();
		System.out.println(fibo(50));
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime );	
	}
	
	public static long fibo(int n) {
		long first = 1;
		long second = 1;
		
		if(n==1) return first;
		else if (n==2) return second;
		
		long third = 0;
		
		for(int i =3; i<=n; i++) {
			third = first+second;
			first = second;
			second = third;
		}
		return third;
	}

}
