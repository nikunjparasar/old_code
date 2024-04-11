package jrJava.maze_2_network;

import java.io.InputStream;
import java.util.Scanner;


public class MessageReceiver implements Runnable{
	private Mouse enemyMouse;
	private Scanner scanner;
	
	public MessageReceiver(InputStream is) {
		scanner = new Scanner(is);
	}
	
	public void recieve() {
		try {
			String msg;
			while(true) {
				msg = scanner.nextLine();
				enemyMouse.receiveData(msg);
			}
		}catch(Exception e) {
			
		}
	}

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		recieve();
	}

	public Mouse getEnemyMouse() {
		return enemyMouse;
	}

	public void setEnemyMouse(Mouse enemyMouse) {
		this.enemyMouse = enemyMouse;
	}
	
	
}
