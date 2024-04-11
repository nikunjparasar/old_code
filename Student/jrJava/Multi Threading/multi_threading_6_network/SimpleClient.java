package jrJava.multi_threading_6_network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SimpleClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("192.168.1.4", 5454);
	
		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(os);
		pw.println("message");
		pw.flush();
		pw.close();
		s.close();
		
	}

	
}
