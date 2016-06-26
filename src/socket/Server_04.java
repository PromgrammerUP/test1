package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server_04 {
	public void startServer(){
		try {
			ServerSocket server = new ServerSocket(6666);
			System.out.println("系统消息:服务器在6666端口等待连接....");
			ArrayList<Socket> clients = new ArrayList<Socket>();
			while (true) {
				Socket client = server.accept();
				clients.add(client);
				ClientUnit cu = new ClientUnit(client);
				cu.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Server_04 s = new Server_04();
		s.startServer();
	}
}

class ClientUnit extends Thread{
	private Socket client;
	public ClientUnit(Socket c){
		this.client = c;
	}
	public void run(){
		String ip = client.getInetAddress().getHostAddress();
		System.out.println("客户端ip为："+ip);
		System.out.println("欢迎来自"+ip+"的游客……");
		try {
			InputStream is = client.getInputStream();
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
			String line = null;
			while ((line = br.readLine())!=null) {
				System.out.println(ip+":"+line);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
