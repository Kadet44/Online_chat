package Action;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import Sql_Logic.Connection_MySql;

public class Chat_Server extends Thread {
	
	//private static DataOutputStream outToClient;
	private static BufferedReader inFromClient;
	
	public Chat_Server() {
	
		
		// TODO Auto-generated constructor stub
	
	try {
		ServerSocket welcomeSocket = new ServerSocket(6789);
		Socket connectionSocket = welcomeSocket.accept();
		System.out.println("Сервер открыл welcomeSoclet");
		inFromClient = new BufferedReader( new InputStreamReader(connectionSocket.getInputStream()));
		String message = inFromClient.readLine();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
}
