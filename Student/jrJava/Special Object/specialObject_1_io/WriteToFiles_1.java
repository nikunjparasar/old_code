package jrJava.specialObject_1_io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFiles_1 {

	public WriteToFiles_1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		PrintWriter pw = new PrintWriter("jrJava/specialObject_1_io/output1.txt");
		
		
		pw.print("Hello");
		pw.print("   ");
		pw.print(123);
		pw.print("   ");
		pw.print(3.1415);
		pw.print("   ");
		pw.print(true);
		pw.println();
		
		
		//pw.print("Hello" + 123+ 3.1415 +true);
		
		pw.flush();
		pw.close();
	}

}
