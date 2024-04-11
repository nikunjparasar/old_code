package jrJava.specialObject_1_io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFiles_3 {

	public WriteToFiles_3() {
		
	}

	public static void main(String[] args) throws Exception {
		int[]  ids = {7, 1012, 48, 512};
		String[] names = {"Donald", "Hillary", "Bernie", "Joe"};
		double[] grades = {3.98, 3.78, 4.0, 3.1};
		
		PrintWriter pw = new PrintWriter("jrJava/specialObject_1_io/output3.txt");
		
		for(int i = 0; i<ids.length; i++) {
			//pw.println(ids[i] + "   " + names[i] + "   " + grades[i]);
			
			//pw.printf("%4d   %7s   %4.2f %n", ids[i], names[i], grades[i]);
			pw.printf("id:  %4d   name:  %7s   grade:  %4.2f %n", ids[i], names[i], grades[i]);
		}
		
		pw.flush();
		pw.close();
		
	}

}
