package jrJava.practice12;

public class Practice7 {

	public static void main(String[] args) {
		

	}

	// sum(3, 11, 2) --> 3 + 5 + 7 + 9 + 11
	public static int sum(int begin, int end, int increment) {
		int sum = 0;
		int i;
		for(i=begin; i<=end; i+=increment) {
			sum += i;
		}
		return sum;
	}
	
	// sum(3, 8) --> 3 + 4 + 5 + 6 + 7 + 8
	public static int sum(int begin, int end) {
		return sum(begin, end, 1);
		//int sum = 0;
		//int i;
		//for(i=begin; i<=end; i++) {
		//	sum += i;
		//}
		//return sum;
	}
	
	// sum(5) --> 1 + 2+ 3 + 4 + 5
	public static int sum(int end) {
		return sum(1, end, 1);
		//int sum = 0;
		//int i;
		//for(i=1; i<=end; i++) {
		//	sum += i;
		//}
		//return sum;
	}
}







