package jrJava.multi_threading_7_twoWayNetworking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(5454);
		Socket s = ss.accept();
		

		InputStream is= s.getInputStream();
		OutputStream os = s.getOutputStream();
	
		MessageSender sender = new MessageSender(os);
		MessageReciever reciever = new MessageReciever(is);
		
		new Thread(reciever).start();;
		
		sender.send();
		
	}

}
