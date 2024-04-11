package jrJava.specialObjects_4_StringPractice;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice4 {

	public Practice4() {
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
			line= line.replaceAll("Harry", "Name");
			System.out.println(line);
				
		}
		System.out.println("Word Count: " + count);
		
		
		
		
		
	}

}
