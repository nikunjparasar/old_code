package jrJava.recursion_2_practices;

public class Practice5_SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumOfDigits(1703));
	}

	public static int sumOfDigits(int number) {
		
		if(number<10) return number;
		return sumOfDigits(number/10) + number%10;
	}
}
