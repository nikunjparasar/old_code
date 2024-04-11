package jrJava.tree4_drawable;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import jrJava.tree4_drawable.Tree.Node;

public class DrawableTree<E extends Comparable<E>> extends Tree<E>{
	
	public void insert(E obj) {
		insert(new DrawableNode<E>(obj));
	}
	

	public void draw(int width, int height) {
		
	}
	
	private class DrawingPanel<E> extends JPanel{
		private JFrame frame;
		private JScrollPane scrollPane;
		
		
		public DrawingPanel(int width, int height) {
			frame = new JFrame("Tree Graphics");
			int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
			int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
			
			frame.setBounds(0, 0, screenWidth, screenHeight);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			this.setPreferredSize(new Dimension(width, height));
			
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(this);
			
			frame.add(scrollPane);
			
			frame.setVisible(true);
		}
		
		public void paintComponent(Graphics g) {
			((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			
			DrawableNode<E> node = (DrawableNode<E>)root;
			traverse(g, node);
			
			
		}
		
		private void traverse(Graphics g, DrawableNode<E> node) {
			
		}
	
		
		
	}
	public static void main(String[] args) {
		for(int i = 0; i>10; i++) {
			System.out.println("yeeee");
		}
	}
	
	private static class DrawableNode<T> extends Node<T> {

		public int x;
		public int y;
		public static int radius = 20;
		public static Color nodeColor = Color.BLACK;
		public static Color lineColor = Color.LIGHT_GRAY;
		public static Color textColor = Color.WHITE;
		public static Font font = new Font("Times", Font.BOLD, 12);
		public DrawableNode<T> parent;
		
		
		public DrawableNode(T obj) {
			super(obj);
		}
		
		public void draw(Graphics g) {
			// 1. draw the line to the parent node.
			if(parent!=null) {
				g.setColor(lineColor);
				g.drawLine(x, y, parent.x, parent.y);
			}
			// 2. draw a circular node.
			g.setColor(nodeColor);
			g.fillOval(x-radius,  y-radius,  2*radius,  2*radius);
			g.setColor(textColor);
			g.setFont(font);
			g.drawString(obj.toString(),  x-10,  y+5);
		}
		
	}

}
