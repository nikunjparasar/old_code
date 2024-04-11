package jrJava.lineOfAction3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class GameBoard implements MouseListener, MouseMotionListener {

	private Graphics g;
	private int radius = 15;
	private int margin = 100;
	private int interval = 50;
	
	private int rows, cols;
	
	private int[] sq = {
		 0,  1,  1,  1,  0,
		-1,  0,  0,  0, -1,
		-1,  0,  0,  0, -1,
		-1,  0,  0,  0, -1,
		 0,  1,  1,  1,  0
	};
	
	private int turn; // Red:1, Green:-1
	private int selected; // the index of the selected square.
	private boolean beingDragged;
	private int dragX, dragY;
	private boolean dragCompleted;
	private int dragEndIndex;
	
	private ArrayList<Integer> validMovesList;
	private int[] dirX = {1, -1, 0,  0, 1,  1, -1, -1};
	private int[] dirY = {0,  0, 1, -1, 1, -1,  1, -1};
	
	
	
	public GameBoard(Graphics g) {
		this.g = g;
		rows = 5;
		cols = 5;
		turn = 1; // Red's turn.
		selected = -1;
		
		validMovesList = new ArrayList<Integer>();
	}
	
	
	public int getTurn() { return turn; }
	public void setTurn(int turn) { this.turn = turn; }
	
	
	
	public void draw() {
		g.setColor(Color.BLACK); 
		
		for(int i=0; i<=cols; i++) g.drawLine(margin + i*interval, margin, 
				                   margin + i*interval, margin + rows*interval);
		for(int i=0; i<=rows; i++) g.drawLine(margin, margin + i*interval,
				                   margin + cols*interval, margin + i*interval);
		
		// display pieces.
		int x, y;
		for(int k=0; k<sq.length; k++) {
			x = margin + k%cols*interval + interval/2 - radius;
			y = margin + k/cols*interval + interval/2 - radius;
			
			if(sq[k]==1) {
				g.setColor(Color.RED);
				g.fillOval(x, y, 2*radius, 2*radius);
			}
			else if(sq[k]==-1) {
				g.setColor(Color.GREEN);
				g.fillOval(x, y, 2*radius, 2*radius);
			}
		}
		
		if(!dragCompleted && selected>=0) {
			markSelected();
			markAllValidMoves();
		}
		
		if(beingDragged) {
			g.setColor(Color.GRAY);
			g.fillOval(dragX-6, dragY-6, 12, 12);
		}
		 
	}


	private int findIndex(int x, int y) {
		return (x-margin)/interval + (y-margin)/interval*cols;
	}
	
	
	private void markAllValidMoves() {
		g.setColor(Color.GRAY);
		int markIndex, markX, markY;
		
		for(int i=0; i<validMovesList.size(); i++) {
			markIndex = validMovesList.get(i);
			markX = margin + markIndex%cols*interval;
			markY = margin + markIndex/cols*interval;
			g.drawRect(markX+2, markY+2, interval-4, interval-4);
			g.drawRect(markX+3, markY+3, interval-6, interval-6);
		}
	} 
	
	
	private void markSelected() {
		int x = margin + selected%cols*interval + interval/2;
		int y = margin + selected/cols*interval + interval/2;
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(x-6, y-6, 12, 12);
	}
	 
	
	public void mousePressed(MouseEvent e) {
		if(!Coordinator.humanPlayerTurn) return;
		
		int mousePressedIndex = findIndex(e.getX(), e.getY());
		if(sq[mousePressedIndex]!=turn) return;
		selected = mousePressedIndex;
		dragCompleted = false;
		
		findAllValidMoves();
	}
	

	public void mouseDragged(MouseEvent e) {
		if(!Coordinator.humanPlayerTurn) return;
		
		if(selected<0) return;
		beingDragged = true;
		dragX = e.getX();
		dragY = e.getY();
	}


	public void mouseReleased(MouseEvent e) {
		if(!Coordinator.humanPlayerTurn) return;
		
		if(selected<0) return;
		beingDragged = false;
		dragCompleted = true;
		dragEndIndex = findIndex(e.getX(), e.getY());
		
		if(!isValidMove()) {
			selected = -1;
			return;
		}
		
		sq[selected] = 0;
		sq[dragEndIndex] = turn;
		selected = -1;
		
		boolean result = isGameOver();
		if(result) {
			//Coordinator.gameOver = true;
			Coordinator.winner = turn;
		}
		
		turn *= - 1;
		Coordinator.humanPlayerTurn = false;
	}
	
	
	public void mouseMoved(MouseEvent e) { }
	public void mouseClicked(MouseEvent e) { }
	public void mouseEntered(MouseEvent e) { }
	public void mouseExited(MouseEvent e) { }
	 
	
	public void findAllValidMoves() {
		
		validMovesList.clear();
		
		int selectX = selected%cols;
		int selectY = selected/cols;
		int numOfSteps;
		int targetX, targetY, targetIndex;
		int k, px, py, pIndex;
		
		for(int i=0; i<dirX.length; i++) {
			numOfSteps = findNumOfPiecesInLineOfAction(dirX[i], dirY[i]); 
			targetX = selectX + dirX[i]*numOfSteps;
			targetY = selectY + dirY[i]*numOfSteps;
			targetIndex = targetX + targetY*cols;
			
			// Is still inside the board?
			if(targetX<0 || targetX>=cols || targetY<0 || targetY>=rows) continue;
			
			// will land on a friendly piece?
			if(sq[targetIndex]==turn) continue;
			
			// Will jump over enemy piece? 
			boolean jumpOverEnemy = false;
			for(k=1; k<numOfSteps; k++) {
				px = selectX + dirX[i]*k;
				py = selectY + dirY[i]*k;
				pIndex = px + py*cols;
				if(sq[pIndex]==-turn) {
					jumpOverEnemy = true;
					break;
				}
			}
			if(jumpOverEnemy) continue;
			
			validMovesList.add(targetIndex);
		}
	}
	
	
	private boolean isValidMove() {
		return validMovesList.contains(dragEndIndex);
	}
	
	
	private int findNumOfPiecesInLineOfAction(int xInc, int yInc) {
		int pX, pY, pIndex;
		
		int numOfPieces = 1; // itself
		
		for(int i=1; i<cols; i++) { //forward
			pX = selected%cols + xInc*i;
			pY = selected/cols + yInc*i;
			pIndex = pX + pY*cols;
			if(pX<0 || pX>=cols || pY<0 || pY>=rows) break;
			if(sq[pIndex]!=0) numOfPieces++;
		}
		
		for(int i=1; i<cols; i++) { //backward
			pX = selected%cols - xInc*i;
			pY = selected/cols - yInc*i;
			pIndex = pX + pY*cols;
			if(pX<0 || pX>=cols || pY<0 || pY>=rows) break;
			if(sq[pIndex]!=0) numOfPieces++;
		}
		
		return numOfPieces;
	}
	
	
	private boolean isGameOver() {
		ArrayList<Integer> pieces = new ArrayList<Integer>();
		ArrayList<Integer> cluster = new ArrayList<Integer>();
		
		for(int i=0; i<sq.length; i++) if(sq[i]==turn) pieces.add(i);
		
		// cluster starts with one element.
		cluster.add(pieces.remove(0));
		
		int clusterSize;
		while(!pieces.isEmpty()) {
			clusterSize = cluster.size();
			addToCluster(pieces, cluster);
			if(cluster.size()==clusterSize) return false;
		}
		return true;
	}
	
	
	private void addToCluster(ArrayList<Integer> pieces, ArrayList<Integer> cluster) {
		int i, j, each, cEach;
		
		for(i=pieces.size()-1; i>=0; i--) {
			each = pieces.get(i);
			for(j=0; j<cluster.size(); j++) {
				cEach = cluster.get(j);
				if(Math.abs(cEach%cols-each%cols)<=1 &&
				   Math.abs(cEach/cols-each/cols)<=1) {
					cluster.add(each);
					pieces.remove(i);
					break;
				}
			}
		}
	}
	
}
























