package jrJava.specialObjects_4_StringPractice;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice2 {

	public Practice2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(new File("jrJava/specialObjects_4_StringPractice/HarryPotter.txt"));
		
		int count =0;
		String line;
		StringTokenizer st;
		String token;
		while(s.hasNextLine()) {
			line = s.nextLine();
			
			st = new StringTokenizer(line," ,.\":;");
			while (st.hasMoreTokens()) {
				token = st.nextToken();
				if(token.indexOf("pp")<0) continue;
				System.out.println(token);
				count++;
			}
		}
		System.out.println("Word Count: " + count);
		
		
		
		
		
	}

}
