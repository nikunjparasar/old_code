package jrJava.GUI_layouts;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class UsingBorderLayout {
	
	private JFrame frame;
	private JPanel panel;
	private JButton[] buttons;

	
	
	public UsingBorderLayout() {
		frame = new JFrame("BorderLayout");
		frame.setBounds(200, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel =new JPanel();
		frame.add(panel);
		panel.setBackground(Color.WHITE);
		panel.setLayout(new BorderLayout(20, 30));
		buttons = new JButton[5];
		for(int i = 0; i< buttons.length; i++) {
			buttons[i] = new JButton("Button" + (i+1));
			panel.add(buttons[i]);
		}
		
		panel.add(buttons[0], BorderLayout.CENTER);
		panel.add(buttons[1], BorderLayout.NORTH);
		panel.add(buttons[2], BorderLayout.SOUTH);
		panel.add(buttons[3], BorderLayout.WEST);
		panel.add(buttons[4], BorderLayout.EAST);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UsingBorderLayout();
	}

}












