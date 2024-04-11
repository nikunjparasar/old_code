package jrJava.GUI_extendingComponents;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;


public class MyPanel extends JPanel {

	private int x = 200, y = 300;
	private int radius = 50;
	private Color color = Color.RED;
	
	
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.setColor(color);
		g.fillOval(x-radius, y-radius, 2*radius, 2*radius);
		
	}
	
}
