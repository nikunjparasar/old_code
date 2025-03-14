package jrJava.practice18_alienInvader_9_usingImagesandSounds;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
public class Alien {
	public int x, y; // bottom-center
	public static int size;
	public Image image, imageAlt;
	public int vx, vy;
	public boolean collided;
	public static Color explosionColor;
	public static int explosionRadius;
	public int drawCount;
	public int drawCycle = 8;	
	static {	
		size = 40;		
		explosionColor = Color.GREEN;
		explosionRadius = 100;
	}		
	public Alien(int x, int y, Image image, Image imagealt, int vx, int vy) {
		this.x = x;
		this.y = y;
		this.image = image; 
		this.imageAlt = imagealt;
		this.vx = vx;
		this.vy = vy;
	}	
	public void move(Ship ship) {
		x += vx;
		y += vy; 		
		if(y>690) AlienManager.remove(this); 		
		if(x<0 || x>600) vx = -vx;				
		if(y>=100 && y<=500) {
			shootMissile();
		}		
		collided = ship.isHit(this);
	}		
	public boolean isHit(Torpedo torpedo) {	
		if(torpedo.x>=x-size/2-Torpedo.width/2 && 
		   torpedo.x<=x+size/2+Torpedo.width/2 &&
		   torpedo.y>=y-size-Torpedo.height	&& 
		   torpedo.y<=y) {		
			AlienManager.remove(this); 
			return true;
		}		
		return false;
	}	
	public void draw(Graphics g) {	
		drawCount++;
		if(drawCount % drawCycle < drawCycle/2)g.drawImage(image, x - size/2 ,y - size , size, size, null);
		else g.drawImage(imageAlt, x - size/2 ,y - size , size, size, null);		
		if(collided) {
			g.setColor(explosionColor);
			g.drawOval(x-explosionRadius, y-explosionRadius, 2*explosionRadius, 2*explosionRadius);
			AlienManager.remove(this); 
		}
	}
	public void shootMissile() {
		if(Math.random()>0.1) return;
		MissileManager.add( new Missile(x, y+Missile.height, 2*vy) );
	}
}