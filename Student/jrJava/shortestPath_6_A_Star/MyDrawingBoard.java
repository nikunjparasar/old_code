package jrJava.shortestPath_6_A_Star;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.*;


public class MyDrawingBoard extends JPanel {

	private JFrame frame;
	private BufferedImage bImage;
	private Graphics bufferedG;
	
	
	public MyDrawingBoard(int x, int y, int w, int h) {
		frame = new JFrame("DrawingBoard");
		frame.setBounds(x, y, 0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setPreferredSize(new Dimension(w, h));
		frame.add(this);
		frame.pack();
		frame.setVisible(true); 
		
		bImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		bufferedG = bImage.getGraphics();	
		((Graphics2D)bufferedG).setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				                                 RenderingHints.VALUE_ANTIALIAS_ON);
		
		bufferedG.setColor(Color.WHITE);
		bufferedG.fillRect(0, 0, w, h);
	}
	
	public Graphics getBufferedG() { return bufferedG; }
	
	
	public void clear() {
		//bufferedG.setColor(Color.WHITE);
		//bufferedG.fillRect(0, 0, getWidth(), getHeight());
		int i, j;
		for(i=0; i<getWidth(); i++) {
			for(j=0; j<getHeight(); j++) {
				bImage.setRGB(i, j, 0xffffffff);
			}
		}
	}
	
 	 
	public void paintComponent(Graphics g) {
		g.drawImage(bImage, 0, 0, this);
	}
	
}







