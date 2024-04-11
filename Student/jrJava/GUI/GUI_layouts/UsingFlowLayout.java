package jrJava.GUI_layouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.*;

public class UsingFlowLayout {
	
	private JFrame frame;
	private JPanel panel;
	private JButton[] buttons;

	
	
	public UsingFlowLayout() {
		frame = new JFrame("BorderLayout");
		frame.setBounds(200, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel =new JPanel();
		panel.setBackground(Color.WHITE);
		//panel.setLayout(new FlowLayout);
		frame.add(panel);
		buttons = new JButton[20];
		for(int i = 0; i< buttons.length; i++) {
			buttons[i] = new JButton("Button" + (i+1));
			panel.add(buttons[i]);
		}
		
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UsingFlowLayout();
	}

}












