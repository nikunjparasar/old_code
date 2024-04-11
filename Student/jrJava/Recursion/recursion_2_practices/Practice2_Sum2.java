package jrJava.recursion_2_practices;

public class Practice2_Sum2 {

	public static void main(String[] args) {
		

	}
	//begin + begin+1 + begin+2 + ... +end
	public static int sum(int begin, int end){
		if(begin==end) return begin;
		int mid = (begin + end)/2;	
		return sum(begin, mid) + sum(mid+1, end);
		
	}
	
}
