package jrJava.tree4_drawable;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;

import javax.swing.*;


public class DrawingPanel extends JPanel{
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
		
	}
	
}
