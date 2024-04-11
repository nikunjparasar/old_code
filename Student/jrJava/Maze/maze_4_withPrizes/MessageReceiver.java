package jrJava.maze_4_withPrizes;

import java.io.InputStream;
import java.util.Scanner;

public class MessageReceiver implements Runnable {

	private Scanner scanner;
	private Mouse enemyMouse;
	
	public MessageReceiver(InputStream is) {
		scanner = new Scanner(is);
	}
	
	public void setEnemyMouse(Mouse enemyMouse) {
		this.enemyMouse = enemyMouse;
	}
	
	
	public void run() {
		receive();
	}
	
	public void receive() {
		try {
			String msg;
			while(true) {
				msg = scanner.nextLine();
				enemyMouse.receiveData(msg);
			}
		}
		catch(Exception e) { }
	}
}

