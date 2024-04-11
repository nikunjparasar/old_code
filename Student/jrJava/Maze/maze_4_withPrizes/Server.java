package jrJava.maze_4_withPrizes;

import java.awt.Graphics;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import resources.DrawingBoard;

public class Server {

	private int serverPortNumber = 5454;
	private InputStream is;
	private OutputStream os;
	
	public InputStream getInputStream() { return is; }
	public OutputStream getOutputStream() { return os; }
	
	public void connect() {
		try {
			ServerSocket ss = new ServerSocket(serverPortNumber);
			Socket s = ss.accept();
			
			is = s.getInputStream();
			os = s.getOutputStream();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		Server server = new Server();
		server.connect();
		
		MessageSender sender = new MessageSender(server.getOutputStream());
		MessageReceiver receiver = new MessageReceiver(server.getInputStream());
		new Thread(receiver).start();
		
		Mouse myMouse = new Mouse(true, 450, 490, 3, 0, -1);
		Mouse enemyMouse = new Mouse(false, 50, 75, 3, 1, 0);
		
		myMouse.setMessageSender(sender);
		receiver.setEnemyMouse(enemyMouse);
		
		Maze maze = new Maze();
		myMouse.setMaze(maze); 
		enemyMouse.setMaze(maze); 
		
		DrawingBoard board = new DrawingBoard(650, 0, 510, 510);
		Graphics g = board.getCanvas();
		
		board.getJFrame().addKeyListener(myMouse);
		new Thread(myMouse).start();
		
		while(true) {
			board.clear();
			
			myMouse.draw(g);
			enemyMouse.draw(g);
			maze.draw(g);
			
			board.repaint();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) { }
			
		}
		
	}

}








