package jrJava.multi_threading_7_twoWayNetworking;

import java.io.InputStream;
import java.util.Scanner;

public class MessageReciever implements Runnable{
	private Scanner scanner;
	
	public MessageReciever(InputStream is) {
		scanner = new Scanner(is);
	}
	
	public void recieve() {
		String msg;
		while(true) {
			msg = scanner.nextLine();
			System.out.println(msg);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		recieve();
	}
	
}
