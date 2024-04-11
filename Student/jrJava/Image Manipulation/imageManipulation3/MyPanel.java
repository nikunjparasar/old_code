package jrJava.imageManipulation3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

	public JFrame frame;
	private Circle c;
	private Square s;
	
	public MyPanel(int x, int y, int w, int h) {
		frame = new JFrame("My JPanel");
		frame.setBounds(x, y, 0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setPreferredSize(new Dimension(w, h));
		frame.add(this);
		frame.pack();
		frame.setVisible(true); 
	}
	
	
	public void setDrawingObjects(Circle c, Square s) {
		this.c = c;
		this.s = s;
	}
	
	
	public void paintComponent(Graphics g) {
		((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				                         RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		c.draw(g);
		s.draw(g);
	}
	
} 


