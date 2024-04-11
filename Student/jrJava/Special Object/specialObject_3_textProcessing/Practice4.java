package jrJava.specialObject_3_textProcessing;

import jrJava.specialObjects_String_object.Thing;

public class Practice4 {


	//StringBuilder
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "I love you.";
		String str2 = "I hate you.";
		String str3 = "I don't care.";
	
		Thing thing = new Thing(10, "Hello");
		
		//String combined  = str1 + " " + 512 + str2 +" " + 3.1415 + " " + str3 + " " + true;
		//System.out.println(combined);
		
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(str1);
		sb.append(" ");
		sb.append(512);
		sb.append(" ");
		sb.append(str2);
		sb.append(" ");
		sb.append(3.1415);
		sb.append(" ");
		sb.append(str3);
		sb.append(" ");
		sb.append(true);
		sb.append(" ");
		sb.append(thing);
		
		String combined = sb.toString();
		System.out.println(combined);
		
		
		
		StringBuilder sb1 = new StringBuilder();
		
		for(int i = 11; i<=100; i++) {
			sb1.append(i);
			if(i!=100) sb1.append(" ");
		}
		String combined2 = sb1.toString();
		System.out.println(combined2);
		
		
		
	}

}
