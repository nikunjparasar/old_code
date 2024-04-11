package jrJava.recursion_4_morePractices;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample = "racecar";
		System.out.println(isPalindrome(sample, 0, sample.length()-1));
		
	}
/*
	public static boolean isPalindrome(String text, int begin, int end) {
		if(begin>=end) return true;
		if(text.charAt(begin) != text.charAt(end)) return false;
		return isPalindrome(text, begin+1, end-1);
		
	}
*/
/*	
	public static boolean isPalindrome(String text, int begin, int end) {
		if(begin>=end) return true;
		if(text.charAt(begin) == text.charAt(end)) {
			return isPalindrome(text, begin+1, end-1);
		}
		return false;
	}
*/
	
	public static boolean isPalindrome(String text, int begin, int end) {
		if(begin>=end) return true;
		return text.charAt(begin) == text.charAt(end) && isPalindrome(text, begin+1, end-1);
	}
		
	
}
