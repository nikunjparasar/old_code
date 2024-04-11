package jrJava.imageManipulation2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class UsingGraphicsOnBufferedImage {

	public static void main(String[] args) throws Exception  {
		
		BufferedImage bImage = new BufferedImage(500, 500, BufferedImage.TYPE_INT_ARGB);
		Graphics g = bImage.getGraphics();

		((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(Color.RED);
		g.fillOval(150, 150, 200, 200);
		
		ImageIO.write(bImage, "png", new File("jrJava/imageManipulation2/test1.png"));
	}

}
