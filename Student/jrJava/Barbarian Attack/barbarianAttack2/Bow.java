package jrJava.barbarianAttack2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.GeneralPath;

public class Bow implements MouseListener, MouseMotionListener {

	private static Point[] bowGrip_template = new Point[] {  
			new Point(-2, -15),
			new Point(-2, 15),
			new Point(3, 15),
			new Point(3, -15),
			new Point(-2, -15)
	};
	
	private static Point[] bow_0_template  =  new Point[]{ 
			new Point(-1, -15),
			new Point(0, -55),
			new Point(15, -45),
			new Point(16, -74),
			new Point(17, -74),
			new Point(15, -45),
			new Point(1, -53),
			new Point(2, -15),
			new Point(-2, -15),
			new Point(-1, 15),
			new Point(0, 55),
			new Point(15, 45),
			new Point(16, 74),
			new Point(17, 74),
			new Point(15, 45),
			new Point(1, 55),
			new Point(2, 15),
			new Point(-2, 15)
	};


	private static Point[] bow_100_template =  new Point[]{   
			new Point(-1, -15),
			new Point(10, -54),
			new Point(45, -35),
			new Point(56, -54),
			new Point(57, -54),
			new Point(45, -34),
			new Point(4, -49),
			new Point(2, -15),
			new Point(-2, -15),
			new Point(-1, 15),
			new Point(10, 54),
			new Point(45, 35),
			new Point(56, 54),
			new Point(57, 54),
			new Point(45, 34),
			new Point(4, 49),
			new Point(2, 15),
			new Point(-2, 15),
			new Point(0, 0)
	};
	
	private static Point[] bowGrip = new Point[bowGrip_template.length];
	private static Point[] bow = new Point[bow_0_template.length];
	private static Point refPoint;
	private static double scaleFactor, angleInRadian, stretchFactor;
	private static Color bowGripColor = new Color(150, 0, 0), bowColor = new Color(180, 0, 0);
	
	private static int mx0, my0;
	private static int mx, my;
	private static int arrowHeadX, arrowHeadY, arrowTailX, arrowTailY;
	private static double stretchLength = 0;
	private static double arrowLength;
	private static Stroke stroke = new BasicStroke(0.5f);
	private static boolean arrowLoaded;
	private static double maxDragDistance;
	
	static {
		for(int i=0; i<bowGrip.length; i++) bowGrip[i] = new Point(0, 0);
		for(int i=0; i<bow.length; i++) bow[i] = new Point(0, 0);
	}
	
	
	public Bow(int x, int y, double scale, double angle) {
		refPoint = new Point(x, y);
		scaleFactor = scale;
		angleInRadian = angle*Math.PI/180;
		
		maxDragDistance = 200*scaleFactor;
		arrowLength = (150)*scaleFactor; 
		
		MathUtility.translate(bowGrip_template, refPoint);
		MathUtility.translate(bow_0_template, refPoint);
		MathUtility.translate(bow_100_template, refPoint);

		stretchScaleAndRotatePoints();
	}
	
	public void setStretchFactor(double stretchFactor) { 
		Bow.stretchFactor = stretchFactor; 
		stretchScaleAndRotatePoints();
	}
	
	
	private static void stretchScaleAndRotatePoints() {
		
		for(int i=0; i<bow_0_template.length; i++) {
			bow[i].x = bow_0_template[i].x*(1-stretchFactor) + bow_100_template[i].x*stretchFactor;
			bow[i].y = bow_0_template[i].y*(1-stretchFactor) + bow_100_template[i].y*stretchFactor;
		}
		
		for(int i=0; i<bowGrip_template.length; i++) {
			bowGrip[i].x = bowGrip_template[i].x;
			bowGrip[i].y = bowGrip_template[i].y;
			MathUtility.scaleAndRotate(bowGrip[i], refPoint, scaleFactor, angleInRadian);
		}
		for(int i=0; i<bow_0_template.length; i++) {
			//bow[i].x = bow_0_template[i].x;
			//bow[i].y = bow_0_template[i].y;
			MathUtility.scaleAndRotate(bow[i], refPoint, scaleFactor, angleInRadian);
		}
	}
	
	
	public void draw(Graphics2D g) {
		
		stretchScaleAndRotatePoints();
		
		// draw arrow.
		arrowTailX = (int)((bow[4].x + bow[13].x)/2 + stretchLength*Math.cos(angleInRadian));
		arrowTailY = (int)((bow[4].y + bow[13].y)/2 + stretchLength*Math.sin(angleInRadian));
		arrowHeadX = (int)(arrowTailX - arrowLength*Math.cos(angleInRadian));
		arrowHeadY = (int)(arrowTailY - arrowLength*Math.sin(angleInRadian));
		
		if(arrowLoaded) {
			g.setColor(Color.BLACK);
			g.drawLine(arrowHeadX, arrowHeadY, arrowTailX, arrowTailY);
		}
		
		g.setColor(bowGripColor);
		GeneralPath bowGripPath = new GeneralPath();
		bowGripPath.moveTo(bowGrip[0].x, bowGrip[0].y);
		for(int i=1; i<bowGrip.length; i++) {
			bowGripPath.lineTo(bowGrip[i].x, bowGrip[i].y);
		}
		g.fill(bowGripPath);
		
		g.setColor(bowColor);
		GeneralPath bowPath = new GeneralPath();
		bowPath.moveTo(bow[0].x, bow[0].y);
		bowPath.curveTo(bow[1].x, bow[1].y,
				        bow[2].x, bow[2].y,
				        bow[3].x, bow[3].y);
		bowPath.lineTo(bow[4].x, bow[4].y);
		bowPath.curveTo(bow[5].x, bow[5].y,
		               bow[6].x, bow[6].y,
		               bow[7].x, bow[7].y);
		bowPath.lineTo(bow[8].x, bow[8].y);
		
		bowPath.moveTo(bow[9].x, bow[9].y);
		bowPath.curveTo(bow[10].x, bow[10].y,
				        bow[11].x, bow[11].y,
				        bow[12].x, bow[12].y);
		bowPath.lineTo(bow[13].x, bow[13].y);
		bowPath.curveTo(bow[14].x, bow[14].y,
		               bow[15].x, bow[15].y,
		               bow[16].x, bow[16].y);
		bowPath.lineTo(bow[17].x, bow[17].y);
		
		g.fill(bowPath);
		
		g.setColor(Color.DARK_GRAY);
		GeneralPath bowStringPath = new GeneralPath();
		bowStringPath.moveTo(bow[4].x, bow[4].y);
		bowStringPath.lineTo(arrowTailX, arrowTailY);
		bowStringPath.lineTo(bow[13].x, bow[13].y);
		g.setStroke(stroke);
		g.draw(bowStringPath);
	}
	
	
	public void mousePressed(MouseEvent e) {
		mx0 = e.getX();
		my0 = e.getY();
		arrowLoaded = true;
	}
	
	public void mouseDragged(MouseEvent e) { 
		mx = e.getX();
		my = e.getY();
		
		if(mx<=mx0) mx = mx0 + 1;
		//if(my<=my0) my = my0 + 1;
		
		double tan = ((double)my-my0)/(mx-mx0);
		angleInRadian = Math.atan(tan);
		
		double dragDistance = Math.sqrt((mx-mx0)*(mx-mx0) + (my-my0)*(my-my0));
		
		if(dragDistance>maxDragDistance) dragDistance = maxDragDistance;
		
		stretchFactor = dragDistance/maxDragDistance;
		stretchLength = stretchFactor*scaleFactor*80;
	}
	
	
	public void mouseReleased(MouseEvent e) {
		double vx = -0.7*arrowLength*stretchFactor*Math.cos(angleInRadian);
		double vy = -0.7*arrowLength*stretchFactor*Math.sin(angleInRadian);
		ArrowManager.add(new Arrow(arrowHeadX, arrowHeadY, vx, vy, arrowLength));
		
		stretchFactor = 0;
		stretchLength = 0;
		arrowLoaded = false;
	}
	
	
	public void mouseClicked(MouseEvent e) { }
	public void mouseEntered(MouseEvent e) { }
	public void mouseExited(MouseEvent e) { }
	public void mouseMoved(MouseEvent e) { }
	
	
	
}
 










