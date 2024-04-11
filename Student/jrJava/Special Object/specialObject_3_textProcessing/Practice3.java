package jrJava.specialObject_3_textProcessing;

import java.util.StringTokenizer;

public class Practice3 {

	//StringTokenizer
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String exp = "  {[(Sir)]} has ,   an ;    .....    amazing   :  personality. He    must be   ;; very  popular    wherever,,,; he goes.    ";
		
		StringTokenizer st = new StringTokenizer(exp," {}[](),.;:");
		
		String token;
		while (st.hasMoreTokens()) {
			token = st.nextToken();
			System.out.println(token);
		}
			
		String message = "I had a decent breakfast.;I will have a good lunch;I will have a great dinner.;";
		
		StringTokenizer st1 = new StringTokenizer(message, ".;");
		
		while(st1.hasMoreTokens()) {
			token = st1.nextToken();
			System.out.println(token);
		}
		
		
		String data = "3.56, 4.44, 8.09, 6.15, 1.11";
		StringTokenizer st2 = new StringTokenizer(data, ", ");
		
		while(st2.hasMoreTokens()) {
			token = st2.nextToken();
			System.out.println(token);
		}
		
	}

}
