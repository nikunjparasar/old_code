package jrJava.specialObjects_String_object;

public class Practice2 {

	public Practice2() {
		// TODO Auto-generated constructor stub
	}

	//charAt(i),length(),startsWith(seq),endsWith(seq)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phrase = "I love you, Sir.";
		
		int len = phrase.length();//method. array.length
		System.out.println(len);
		
		char ch1 = phrase.charAt(12);
		System.out.println(ch1);
	
		//char ch2 = phrase.charAt(23);
		//System.out.println(ch2);
		
		char ch3 = phrase.charAt(len-1);
		System.out.println(ch3);
		
		char lastCh = phrase.charAt(phrase.length()-1);
		
		for(int i= 0; i<phrase.length();i++) {
			System.out.println(phrase.charAt(i));
		}
		
		
		for(int i= phrase.length()-1; i>=0;i--) {
			System.out.println(phrase.charAt(i));
		}
		
		boolean ans1 = phrase.startsWith("I lo");
		System.out.println(ans1);
		
		
		boolean ans2 = phrase.endsWith(".");
		System.out.println(ans2);
		
		
	}

}
