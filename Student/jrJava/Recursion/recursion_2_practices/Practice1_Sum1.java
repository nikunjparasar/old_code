package jrJava.recursion_2_practices;

public class Practice1_Sum1 {


	public static void main(String[] args) {
		System.out.println(sum(5));
	}
	
	/*
	//1+2+3+4+5+...+n
	public static int sum(int n) {
		int sum = 0;
		for(int i = 0; i<=n; i++ ) {
			sum +=i;
		}
		return sum;
	}
	*/
	
	
	public static int sum(int n) {
		if(n==1) return 1;
		return sum(n-1) + n;
	}

}
