package jrJava.multi_threading_7_twoWayNetworking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("192.168.4", 5454);
		
		InputStream is= s.getInputStream();
		OutputStream os = s.getOutputStream();
	
		MessageSender sender = new MessageSender(os);
		MessageReciever reciever = new MessageReciever(is);
		
		new Thread(reciever).start();
		
		sender.send();
		
		
	}

}
