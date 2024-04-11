package jrJava.multi_threading_8_networkChat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		
		GUI gui = new GUI("Client");
		
		Socket s = new Socket("192.168.1.4", 5454);
		
		InputStream is= s.getInputStream();
		OutputStream os = s.getOutputStream();
	
		MessageSender sender = new MessageSender(os);
		MessageReciever reciever = new MessageReciever(is);
		
		reciever.setGUI(gui);
		gui.setMessageSender(sender);
		
		new Thread(reciever).start();
		
		
		
	}

}
