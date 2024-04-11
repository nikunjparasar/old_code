package jrJava.abstractType_6_generics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utility {

	public static void print(int[] data) {
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " "); 
			if(i!=0 && i%40==0) System.out.println(); 
		}
		System.out.println("\n");
	}
	
	
	public static void print(Object[] objs) {
		for(int i = 0; i<objs.length; i++) {
			System.out.println(objs[i]);
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	public static int[] createArray(int size) {
		int[] data = new int[size];
		for(int i=0; i<data.length; i++) {
			data[i] = (int) (Math.random()*1000);
		}
		return data;
	}
	
	public static int[] copy(int[] data) {
		int[] copied = new int[data.length];
		for(int i=0; i<data.length; i++) copied[i] = data[i];
		return copied;
	}
	
	
	public static Ball[] loadBallsFromFile(String filePath) {
		
		Ball[] balls = null;
		Scanner s;
		int count = 0;
		String line;
		
		try {
			s = new Scanner(new File(filePath));
			while(s.hasNextLine()) {
				line = s.nextLine();
				if(line.trim().length()==0) continue;
				count++;
			}
			s.close();
			
			balls = new Ball[count];
			count = 0;
			
			s = new Scanner(new File(filePath));
			while(s.hasNextLine()) {
				line = s.nextLine();
				if(line.trim().length()==0) continue;
				balls[count] = new Ball(line);
				count++;
			}
			s.close();
		} catch (FileNotFoundException e) { }
		
		return balls;
	}
	
	
	
	
	
public static Employee[] loadEmployeesFromFile(String filePath) {
		
		Employee[] employees = null;
		Scanner s;
		int count = 0;
		String line;
		
		try {
			s = new Scanner(new File(filePath));
			while(s.hasNextLine()) {
				line = s.nextLine();
				if(line.trim().length()==0) continue;
				count++;
			}
			s.close();
			
			employees = new Employee[count];
			count = 0;
			
			s = new Scanner(new File(filePath));
			while(s.hasNextLine()) {
				line = s.nextLine();
				if(line.trim().length()==0) continue;
				employees[count] = new Employee(line);
				count++;
			}
			s.close();
		} catch (FileNotFoundException e) { }
		
		return employees;
	}
	
	
}












