package jrJava.specialObject_3_textProcessing;

public class Practice2 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "breakfast";
		String str2 = " ";
		String str3 = "lunch";
		String str4 = " ";
		String str5 = "dinner";
		
		//combine them into one string
		// breakfast lunch dinner
	
		/*
		String whole1 = str1.concat(str2);
		String whole2 = whole1.concat(str3);
		String whole3 = whole2.concat(str4);
		String whole4 = whole3.concat(str5);
		System.out.println(whole4);
		*/
		//DO NOT DO
		
		//String whole = str1.concat(str2).concat(str3).concat(str4).concat(str5);	
		//String whole2 = str1 + str2 + str3 + str4 + str5;
		//they are the same thing// DO NOT DO 
		
		//String whole3 = str1 + 341 + str2 + 3.1415 + str3;		
		//String whole4 = str1 + String.valueOf(341) + str2 + String.valueOf(3.1415) + str3;
		//same thing
		
		System.out.println(3.1 + 4.4 + "Hello");
		System.out.println(3.1 +"Hello" + 4.4);
		
		
	}

}
