package jrJava.shortestPath_1_BasicsOfGraph;

import java.util.ArrayList;

public class Node {

	private String label;
	private ArrayList<Node> neighbors;
	private ArrayList<Edge> edges;
	
	private Node previous;
	private boolean visited;
	
	
	public Node(String label) {
		this.label = label;
		neighbors = new ArrayList<Node>();
		edges = new ArrayList<Edge>();
	}
	
	public String getLabel() { return label; }
	
	public void addEdge(Edge edge) { edges.add(edge); }
	public void addNeighbor(Node neighbor) { neighbors.add(neighbor); }
	
	public ArrayList<Edge> getEdges() { return edges; }
	public ArrayList<Node> getNeighbors() { return neighbors; }
	
	public void setPrevious(Node previous) { this.previous = previous; }
	public Node getPrevious() { return previous; }
	
	public void setVisited() { visited = true; }
	public boolean visited() { return visited; }
	
	
	public boolean equals(Object o) {
		if(o==this) return true;
		if(!(o instanceof Node)) return false;
		Node other = (Node) o;
		return label.equals(other.label);
	}
	
	public String toString() { return label; }
	
	public int hashCode() { return label.hashCode(); }
	
}





