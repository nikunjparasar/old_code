package jrJava.recursion_2_practices;

public class Practice6_CountNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count5(15505));
	}
	public static int count = 0;
	public static int count5(int number) {
		
		if(number==0) return 0;
		if(number%10 == 5) return count5(number/10) +1;
		else return count5(number/10);
	}
}
