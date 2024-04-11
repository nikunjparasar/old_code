package jrJava.GUI_usingKeyListener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MyGUI implements KeyListener{

	private static JFrame frame;
	private static MyPanel panel;
	private static MyButton button;
	
	
	public MyGUI() {
		
		frame = new JFrame("Extending component");
		frame.setBounds(200, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new MyPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		//panel.addMouseListener(this);
		frame.add(panel);
		
		button = new MyButton();
		button.setBounds(250, 100, 150, 150);
		
		panel.add(button);
		
		frame.setVisible(true); 
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {}
		
		frame.requestFocus();
		frame.addKeyListener(this);
		//panel.requestFocus();
		//panel.addKeyListener(this);
		//button.requestFocus();
		//button.addKeyListener(this);
	} 
	
	
	public void keyPressed(KeyEvent e) {
		char c = e.getKeyChar();
		
		if(c == 'r') {
			panel.useSingleColor(Color.RED);
			button.useSingleColor(Color.RED);
		}
		else if(c == 'g') {
			panel.useSingleColor(Color.GREEN);
			button.useSingleColor(Color.GREEN);
		}
		else if(c == 'b') {
			panel.useSingleColor(Color.BLUE);
			button.useSingleColor(Color.BLUE);
		}
		else if(c == 'm') {
			panel.useSingleColor(null);
			button.useSingleColor(null);
		}
	}
	public void keyTyped(KeyEvent e) {
		
	}
	public void keyReleased(KeyEvent e) {
		
	}
	
	
	public static void main(String[] args) {
		new MyGUI();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { }
		
		
		while(true) {
			panel.moveCircle();
			button.moveCircle();
			
			//frame.repaint();
			panel.repaint();
			//button.repaint();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) { }
		}
		
	}







}







