package jrJava.multi_threading_8_networkChat;

import java.io.InputStream;
import java.util.Scanner;

public class MessageReciever implements Runnable{
	
	private GUI gui;
	private Scanner scanner;
	
	public MessageReciever(InputStream is) {
		scanner = new Scanner(is);
	}
	
	public void recieve() {
		try {
			String msg;
			while(true) {
				msg = scanner.nextLine();
				gui.addMessage(msg);
				
			}
		}catch(Exception e) {
			
		}
	}

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		recieve();
	}
	
	
	public void setGUI(GUI gui) {
		this.gui = gui;
	}
}
