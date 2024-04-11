package jrJava.shortestPath_1_BasicsOfGraph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Graph {

	private HashMap<String, Node> map;
	
	public Graph() {
	
		map = new HashMap<String, Node>(20);
		
		Scanner s = null;
		try {
			s = new Scanner(new File("jrJava/shortestPath_1_BasicsOfGraph/nodes.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String each;
		while(s.hasNext()) {
			each = s.next();
			new Node(each); // ???
		}
		
		s.close();
		
		try {
			s = new Scanner(new File("jrJava/shortestPath_1_BasicsOfGraph/edges.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String node1, node2;
		while(s.hasNext()) {
			node1 = s.next();
			node2 = s.next();
			
			new Edge(node1, node2);
			
			new Edge(node2, node1);
		}
		
		s.close();
	}
	
	
	
	public static void main(String[] args) {
		
	}

}
