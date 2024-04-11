package jrJava.shortestPath_6_A_Star;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GraphicsManager {

	private HashMap<String, Node> map; 
	private MyDrawingBoard board;
	private Graphics g;


	public GraphicsManager(HashMap<String, Node> map) { 
		this.map = map; 
		board = new MyDrawingBoard(200, 0, 800, 800);
		g = board.getBufferedG();
		
		drawEdges();
		drawNodes();
	}
	
	
	public void drawNodes(){
		g.setColor(Color.BLACK);
		g.setFont(new Font("Courier", Font.BOLD, 10));
		int r = 5;
		
		Iterator<String> iter = map.keySet().iterator();
		Node node;
		int x, y;
		String label;
		while(iter.hasNext()){
			label = iter.next();
			node = map.get(label);
			x = (int) node.getX();
			y = (int) node.getY();
			g.fillOval(x-r, y-r, 2*r, 2*r);
			g.drawString(label, x-10, y-10);
		}
		board.repaint();
	}
	
	
	public void drawEdges(){
		g.setFont(new Font("Courier", Font.BOLD, 9));
		
		int i, x1, y1, x2, y2;
		double dist;
		Node node;
		ArrayList<Edge> list;
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()){
			node = map.get(iter.next());
			list = node.getEdges();
			
			for(i=0; i<list.size(); i++){
				x1 = (int) map.get(list.get(i).getStart()).getX();
				y1 = (int) map.get(list.get(i).getStart()).getY();
				x2 = (int) map.get(list.get(i).getEnd()).getX();
				y2 = (int) map.get(list.get(i).getEnd()).getY();
				dist = list.get(i).getDistance();
				
				g.setColor(Color.ORANGE);
				g.drawLine(x1, y1, x2, y2);
				g.setColor(Color.GRAY); 
				g.drawString("" + dist, (x1+x2)/2, (y1+y2)/2);
			}
		}
		board.repaint();
	}
	
	
	public void markMapNode(Node mapNode){
		g.setColor(Color.RED);
		g.drawOval((int)mapNode.getX()-10, (int)mapNode.getY()-10, 20, 20);
		board.repaint();
	}
	
	public void markEdge(Node node1, Node node2){
		g.setColor(Color.BLUE);
		((Graphics2D)g).setStroke(new BasicStroke(3.5f));
		g.drawLine((int)node1.getX(), (int)node1.getY(), (int)node2.getX(), (int)node2.getY());
		board.repaint();
	}
	
	
	public void showPath(Node start, Node end){
		g.setColor(Color.RED);
		((Graphics2D)g).setStroke(new BasicStroke(5.0f));
		
		Node c = end;
		Node p;
		while(c!=start) {
			p = c.getPrevious();
			g.drawLine((int)p.getX(), (int)p.getY(), (int)c.getX(), (int)c.getY()); 
			c = p;
		}
		board.repaint();
	}
} 
 










