package jrJava.shortestPath_1_BasicsOfGraph;

public class Edge {

	//private Node start;
	//private Node end;
	//private boolean directed; 
	//private double weight; 
	//private String name;
	
	private String start;
	private String end;
	
	public Edge(String start, String end) {
		this.start = start;
		this.end = end;
	}
	
	public String getStart() { return start; }
	public String getEnd() { return end; }
	
}



