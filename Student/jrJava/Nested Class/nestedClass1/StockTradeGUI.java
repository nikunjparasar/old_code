package jrJava.nestedClass1;

import java.awt.Color;

import javax.swing.*;

public class StockTradeGUI {

	private JFrame frame;
	private JPanel panel;
	private JButton button;
	private JTextField textField;
	
	public StockTradeGUI(){
		
		frame = new JFrame();
		frame.setTitle("Stock Trade");
		frame.setBounds(100, 100, 400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.white);
		frame.getContentPane().add(panel);
		panel.setLayout(null); 
		
		button = new JButton("Buy Stock");
		button.setBounds(50, 50, 120, 20);
		panel.add(button);
		
		textField = new JTextField();
		textField.setBounds(50, 200, 270, 20);
		panel.add(textField);
		 
		BuyAgent agent = new BuyAgent();
		agent.setButton(button);
		agent.setTextField(textField);
		button.addActionListener(agent); 
		
		frame.setVisible(true); 
	}
	
	
	public static void main(String[] args) {
		new StockTradeGUI();
	}

}







