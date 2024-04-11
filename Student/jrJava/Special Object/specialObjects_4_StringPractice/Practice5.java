package jrJava.specialObjects_4_StringPractice;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice5 {

	public Practice5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(new File("jrJava/specialObjects_4_StringPractice/employee.txt"));
		
		PrintWriter pw= new PrintWriter("jrJava/specialObjects_4_StringPractice/employee.txt");

		String line;
		StringTokenizer st;
		StringBuilder sb;
		String token;
		String fName, lName, id, title, empYear, salary, dobYY, dobMM, dobDD, gender;
		
		while(s.hasNextLine()) {
			line = s.nextLine();
			if(line.trim().length() == 0)continue;
			
			st = new StringTokenizer(line, " ");
			fName = st.nextToken();
			lName = st.nextToken();
			id = st.nextToken();
			title = st.nextToken();
			empYear = st.nextToken();
			salary = st.nextToken();
			dobYY = st.nextToken();
			dobMM = st.nextToken();
			dobDD = st.nextToken();
			gender = st.nextToken();

			int dobYYnumber = Integer.parseInt(dobYY);
			if(dobYYnumber<1980)continue;
			
			sb = new StringBuilder();
			sb.append(fName);
			sb.append(" ");
			sb.append(lName);
			sb.append(" ");
			sb.append(id);
			sb.append(" ");
			sb.append(title);
			sb.append(" ");
			sb.append(empYear);
			sb.append(" ");
			sb.append(salary);
			sb.append(" ");
			sb.append(dobYY);
			sb.append(" ");
			sb.append(dobMM);
			sb.append(" ");
			sb.append(dobDD);
			sb.append(" ");
			sb.append(gender);
			
			pw.println(sb.toString());
			
			
																									
		}

		pw.flush();
		pw.close();
		
		
		
		
		
	}

}
