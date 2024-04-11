package jrJava.maze_2_network;

import java.awt.Graphics;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import resources.DrawingBoard;



public class Client {

	private String IPAdress = "localhost";
	private int serverPortNumber = 5454;
	
	private InputStream is;
	private OutputStream os;

	public InputStream getInputStream() {
		return is;
	}
	
	public OutputStream getOutputStream() {
		return os;
	}
	
	
	public void connect() {
		try {
			Socket s = new Socket(IPAdress, serverPortNumber);
			
			is = s.getInputStream();
			os = s.getOutputStream();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Client client = new Client();
		client.connect();
		
		MessageSender sender = new MessageSender(client.getOutputStream());
		MessageReceiver receiver = new MessageReceiver(client.getInputStream());
		new Thread(receiver).start();
		

		Mouse enemyMouse = new Mouse (450, 490, 3, 0, -1);
		
		Mouse myMouse = new Mouse (50, 75, 3, 1, 0);
		
		myMouse.setMessageSender(sender);
		receiver.setEnemyMouse(enemyMouse);
		
		DrawingBoard board = new DrawingBoard(200, 0, 500, 500);
		Graphics g = board.getCanvas();
		
		board.getJFrame().addKeyListener(myMouse);
		new Thread(myMouse).start();
		
		while(true) {
			board.clear();
			
			myMouse.draw(g);
			enemyMouse.draw(g);
			
			board.repaint();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		
	}

}
