package jrJava.multi_threading_8_networkChat;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GUI implements ActionListener{
	
	private String title;
	private JFrame frame;
	private JPanel panel;
	private JScrollPane displayPane, typingPane;
	private JTextArea  displayArea, typingArea;
	private JButton send;
	
	private MessageSender sender;
	
	
	public void addMessage(String msg) {
		displayArea.setText(displayArea.getText() +"\n"+ msg);
	}
	
	
	public GUI(String title) {
		this.title = title;
		frame = new JFrame(title);
		if(title.startsWith("C"))
			frame.setBounds(100, 50, 380, 550);
		else
			frame.setBounds(500, 50, 380, 550);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		frame.add(panel);
		
		displayPane = new JScrollPane();
		displayPane.setBounds(30, 20, 300, 200);
		displayArea = new JTextArea();
		displayPane.setViewportView(displayArea);
		panel.add(displayPane);
		
		typingPane = new JScrollPane();
		typingPane.setBounds(30, 240, 300, 200);
		typingArea = new JTextArea();
		typingPane.setViewportView(typingArea);
		panel.add(typingPane);
		
		send = new JButton("send");
		send.setBounds(260, 460, 70, 20);
		send.addActionListener(this);
		panel.add(send);
		
		frame.setVisible(true);
		
		
	}


	public void setMessageSender(MessageSender sender) {
		this.sender = sender;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String msg = typingArea.getText();
		String name;
		if(title.startsWith("C")) {
			name = "Client";
		}
		else {
			name = "Server";
		}
		addMessage(msg);
		typingArea.setText("");
		sender.send(msg);
		
	}
	
	
}
