package jrJava.tree4_drawable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StateTree {

	public static final String DATA_FILE_PATH = "jrJava/tree3_caseStudy/stateData.txt";
	private static Tree<State> tree;
	
	
	public static void main(String[] args) {
		tree = new Tree<State>();
		
		try {
			// load data, create State objects, and insert them into the tree.
			loadData(); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//tree.traverseTopToBottom();
	}

	
	private static void loadData() throws FileNotFoundException { 
		Scanner s = new Scanner(new File(DATA_FILE_PATH));
		s.nextLine(); // Waste the first line.
		
		StringTokenizer st;
		String line;
		String name, abbr, capital;
		int population, area, yy, mm, dd;
		
		while(s.hasNextLine()) {
			line = s.nextLine();
			st = new StringTokenizer(line, " /");
			
			name = st.nextToken();
			abbr = st.nextToken();
			capital = st.nextToken();
			
			population = Integer.parseInt(st.nextToken());
			area = Integer.parseInt(st.nextToken());
			yy = Integer.parseInt(st.nextToken());
			mm = Integer.parseInt(st.nextToken());
			dd = Integer.parseInt(st.nextToken());
			
			tree.insert(new State(name, abbr, capital, population, area, yy, mm, dd));
		}
		
	}
	
}








