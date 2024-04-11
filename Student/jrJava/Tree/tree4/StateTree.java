package jrJava.tree4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StateTree {

	public static final String DATA_FILE_PATH = "jrJava/tree3_caseStudy/stateData.txt";
	
	private static Tree<State> tree;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree = new Tree<State>();
		
		try {
			loadData();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		tree.traverseTopToBottom();
		
	}
	
	private static void loadData() throws FileNotFoundException {
		Scanner s = new Scanner(new File(DATA_FILE_PATH));
		s.nextLine();
		
		StringTokenizer st;
		String name, abbr, capital;
		int population, area, yy, mm, dd;
		String line;
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
