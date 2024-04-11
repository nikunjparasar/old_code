package jrJava.MemoryCard_1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MyGUI{

	private static JFrame frame;
	private static MyPanel panel;
	
	
	
	public MyGUI() {
		
		frame = new JFrame("Extending component");
		frame.setBounds(200, 0, 700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new MyPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		//panel.addMouseListener(this);
		frame.add(panel);
		

		
		frame.setVisible(true); 
	
	} 
	
	
	
	
	public static void main(String[] args) {
		new MyGUI();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { }
		
		
		while(true) {
			
			
			
			//frame.repaint();
			panel.repaint();
			//button.repaint();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) { }
		}
		
	}







}







