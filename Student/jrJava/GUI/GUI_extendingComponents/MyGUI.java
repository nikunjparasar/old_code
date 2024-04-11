package jrJava.GUI_extendingComponents;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyGUI implements ActionListener {

	private JFrame frame;
	private MyPanel panel;
	private MyButton button;
	
	public MyGUI() {
		System.out.println("point 2: " + Thread.currentThread().getId());
		frame = new JFrame("Extending component");
		frame.setBounds(200, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new MyPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		frame.add(panel);
		
		button = new MyButton();
		button.setBounds(250, 100, 120, 60);
		button.addActionListener(this); 
		panel.add(button);
		
		System.out.println("point 3: " + Thread.currentThread().getId());
		frame.setVisible(true); 
		System.out.println("point 4: " + Thread.currentThread().getId());
	}
	
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("The button notified me.");
		System.out.println("actionPerformed: " + Thread.currentThread().getId());
		
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {}
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("point 1: " + Thread.currentThread().getId());
		new MyGUI();
		System.out.println("point 5: " + Thread.currentThread().getId());
	}

}







