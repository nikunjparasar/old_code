package shortestPath_6_A_Star;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Graph {

	private HashMap<String, Node> map;
	private GraphicsManager graphicsManager;
	
	
	public Graph() {
		map = new HashMap<String, Node>(40);
		
		Scanner s = null;
		try {
			s = new Scanner(new File("jrJava/shortestPath_6_A_Star/nodes.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String each;
		while(s.hasNext()) {
			each = s.next();
			map.put(each, new Node(each, s.nextDouble(), s.nextDouble())); 
		}
		s.close();
		
		try {
			s = new Scanner(new File("jrJava/shortestPath_6_A_Star/edges.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String start, road, compass, end;
		double dist;
		while(s.hasNext()) {
			start = s.next();
			road = s.next();
			dist = s.nextDouble();
			compass = s.next();
			end = s.next();
			
			map.get(start).addEdge(new Edge(start, end, road, dist, compass));
			map.get(start).addNeighbor(map.get(end));
			
			String compassReverse = "" + compass.charAt(1) + compass.charAt(0);
			map.get(end).addEdge(new Edge(end, start, road, dist, compassReverse));
			map.get(end).addNeighbor(map.get(start)); 
		}
		s.close();
		
		graphicsManager = new GraphicsManager(map);
	}
	
	
	public void shortestPathTraversal(String start, String end) {
		Node startNode = map.get(start);
		Node endNode = map.get(end);

		// For all nodes, set infinity for their totalEstimatedDistance.
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			map.get(iter.next()).setDistanceToStart(Double.POSITIVE_INFINITY); 
		}
		
		
		PriorityQueue pQueue = new PriorityQueue();
		startNode.setDistanceToStart(0);
		pQueue.add(startNode); 
		
		
		Node current;
		int i;
		double neighborDistance, neighborDistanceToStart, projectedDistance, totalEstimatedDistance;
		
		while(!pQueue.isEmpty()) {
			current = pQueue.poll();
			current.setVisited();
			
			if(!current.equals(startNode)) {
				graphicsManager.markEdge(current.getPrevious(), current); 
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) { }
			
			
			if(current.equals(endNode)) {
				graphicsManager.showPath(startNode, endNode); 
				return;
			}
			
			
			if(current.equals(endNode)) {
				// We found the best path.
				//System.out.println("We arrived the end node.");
				return;
			}
			
			
			ArrayList<Node> neighbors = current.getNeighbors();
			for(i=0; i<neighbors.size(); i++) {
				Node neighbor = neighbors.get(i);
				if(neighbor.visited()) continue;
				
				neighborDistance = current.getDistance(neighbor);
				neighborDistanceToStart = current.getDistanceToStart() + neighborDistance;
				
				if(neighborDistanceToStart<neighbor.getDistanceToStart()) {
				
					neighbor.setDistanceToStart(neighborDistanceToStart);
					projectedDistance = neighbor.calculateDistanceTo(endNode);
					totalEstimatedDistance = neighborDistanceToStart + projectedDistance;
					
					neighbor.setTotalEstimatedDistance(totalEstimatedDistance); // A-star search
					//neighbor.setTotalEstimatedDistance(neighborDistanceToStart); // Dijkstra search
					//neighbor.setTotalEstimatedDistance(projectedDistance); // Greedy best-first search
					
					neighbor.setPrevious(current);
					pQueue.add(neighbor);
				}
			}
		}
	}
	
	
	
	
	
	private class PriorityQueue { // Sorted Linked List
		
		private Link first;
		
		public boolean isEmpty() { return first==null; }
		
		public void add(Node node) { // sorted insertion.
			Link toInsert = new Link(node);
			
			Link current = first;
			Link previous = null;
			while(current!=null && current.node.compareTo(node)<0) {
				previous = current;
				current = current.next;
			}
			
			if(previous==null) {
				if(first!=null) toInsert.next = current;
				first = toInsert;
			}
			else {
				previous.next = toInsert;
				toInsert.next = current;
			}
		}
		
		
		public Node poll() {
			Link temp = first;
			if(first!=null) first = first.next;
			return temp.node;
		}
		
		
		private class Link {
			private Link next;
			private Node node;
			public Link(Node node) { this.node = node; }
			public String toString() { return node.toString(); } 
		}
		
	}
	
	
	
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		Graph graph = new Graph();
		graph.shortestPathTraversal("B1", "G8");
		System.out.println("Time taken to compute shortest path: " + (System.currentTimeMillis()- time));
	}
 
}






















