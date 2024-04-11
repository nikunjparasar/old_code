package jrJava.specialObject_1_io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFiles_2 {

	public WriteToFiles_2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("jrJava/specialObject_1_io/output2.txt");
		
		Thing thing = new Thing(123, "Nikunj");
		
		
		pw.print(thing);
		
		pw.flush();
		pw.close();
	}

}
