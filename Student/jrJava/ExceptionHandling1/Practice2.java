package jrJava.ExceptionHandling1;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		/**
		try {
			doWork1(100, "diary");
		} 
		catch (InterruptedException ie) {
			
		}
		catch (IOException e) {
	
		}
		**/
		doWork1(100, "diary");
		doWork2(100, "diary");
	}
	
	public static void doWork1(int duration, String path) throws InterruptedException, IOException{
	
				Thread.sleep(duration);
				Scanner s = new Scanner(new File(path));


	}
	
	public static void doWork2(int duration, String path) {
		
		try {
			Thread.sleep(duration);
			Scanner s = new Scanner(new File(path));
		}
		catch (InterruptedException ie) {
			
		} 
		catch(IOException ioe) {
			
		}

}

}
