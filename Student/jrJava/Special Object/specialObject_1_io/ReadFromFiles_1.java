package jrJava.specialObject_1_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFiles_1 {

	public ReadFromFiles_1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(new File("jrJava./specialObject_1_io/input1.txt"));
		
		/*
		for(int i = 0; i<4; i++) {
			int data1 = s.nextInt();
			String data2 = s.next();
			double data3 = s.nextDouble();
			System.out.println(data1);
			System.out.println(data2);
			System.out.println(data3);
		}
		*/
		
		/*
		String token;
		while(s.hasNext()){
			token = s.next();
			System.out.println(token);
		}
		*/
		String line;
		while(s.hasNextLine()) {
			line = s.nextLine();
			System.out.println(line);
		}
		
		s.close();
		
	}

}
