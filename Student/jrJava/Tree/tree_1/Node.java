package jrJava.tree_1;

public class Node {

	public int id; // sorting key
	public double value;
	
	public Node leftChild;
	public Node rightChild;
	
	public Node(int id, double value) {
		this.id = id;
		this.value = value;
	}
	
	public String toString() {
		return "{" + id + ", " + value + "}"; 
	}
}
