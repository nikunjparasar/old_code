package jrJava.shortestPath_6_A_Star;

import java.util.ArrayList;

public class Node implements Comparable<Node> {

	private String label;
	private double x, y;
	private ArrayList<Node> neighbors;
	private ArrayList<Edge> edges;
	
	private Node previous;
	private boolean visited;
	
	private double distanceToStart;
	private double totalEstimatedDistance; // distanceToStart + futureProjection (Pythagorean) 
	
	
	
	public Node(String label, double x, double y) {
		this.label = label;
		this.x = x;
		this.y = y;
		neighbors = new ArrayList<Node>();
		edges = new ArrayList<Edge>();
	}
	
	public String getLabel() { return label; }
	
	public double getX() { return x; }
	public double getY() { return y; }
	
	public void addEdge(Edge edge) { edges.add(edge); }
	public void addNeighbor(Node neighbor) { neighbors.add(neighbor); }
	
	public ArrayList<Edge> getEdges() { return edges; }
	public ArrayList<Node> getNeighbors() { return neighbors; }
	
	public void setPrevious(Node previous) { this.previous = previous; }
	public Node getPrevious() { return previous; }
	
	public void setVisited() { visited = true; }
	public boolean visited() { return visited; }
	
	
	public double getDistanceToStart() { return distanceToStart; }
	public void setDistanceToStart(double distanceToStart) { this.distanceToStart = distanceToStart; }
	
	public void setTotalEstimatedDistance(double totalEstimatedDistance) {
		this.totalEstimatedDistance = totalEstimatedDistance; 
	}

	public double getDistance(Node neighbor) {
		for(int i=0; i<edges.size(); i++) {
			if(edges.get(i).getEnd().equals(neighbor.getLabel())) return edges.get(i).getDistance();
		}
		return Double.POSITIVE_INFINITY;
	}
	
	public double calculateDistanceTo(Node node) {
		return Math.sqrt((x-node.x)*(x-node.x) + (y-node.y)*(y-node.y));
	}
	
	public int compareTo(Node node) {
		if(totalEstimatedDistance<node.totalEstimatedDistance) return -1;
		else if(totalEstimatedDistance>node.totalEstimatedDistance) return 1;
		else return 0;
	}
	
	
	public boolean equals(Object o) {
		if(o==this) return true;
		if(!(o instanceof Node)) return false;
		Node other = (Node) o;
		return label.equals(other.label);
	}
	
	public String toString() { return label; }
	
	public int hashCode() { return label.hashCode(); }
	
	
	// Development purpose only. Delete this later.
	public void printAll() {
		System.out.print(label + " --> ");
		for(int i=0; i<neighbors.size(); i++) System.out.print(neighbors.get(i) + " ");
		System.out.println();
	}
	
}











