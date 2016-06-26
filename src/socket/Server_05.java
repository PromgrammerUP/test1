package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Server_05 {

	public void startServer(){
		try {
			ServerSocket server = new ServerSocket(6666);
			System.out.println("系统消息:服务器在6666端口等待连接....");
			ArrayList<Socket> clients = new ArrayList<Socket>();
			
			BroadCast bbc = new BroadCast(clients);
			bbc.start();
			
			while (true) {
				Socket client = server.accept();
				clients.add(client);
				ClientUnit cu = new ClientUnit(client,clients);
				cu.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Server_05 s = new Server_05();
		s.startServer();
	}
	
	class BroadCast extends Thread{
		private ArrayList<Socket> clients;
		public BroadCast(ArrayList<Socket> a){
			this.clients = a;
		}
		public void run(){
			try {
				Scanner scan = new Scanner(System.in);
				while (scan.hasNext()) {
					//取得公众信息
					String input = scan.next();
					
					//设置公共信息格式
					String msg = "公共信息:" + input;
				
					for (Socket c : clients) {
						OutputStream os = c.getOutputStream();
						PrintStream ps = new PrintStream(os);
						ps.println(msg);
						ps.flush();
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	class ClientUnit extends Thread{
		private Socket client;
		private ArrayList<Socket> clients;
		public ClientUnit(Socket c,ArrayList<Socket> clients){
			this.client = c;
			this.clients = clients;
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
					for (Socket c : clients) {
						OutputStream os = c.getOutputStream();
						PrintStream ps = new PrintStream(os);
						ps.println(ip+":"+line);
						ps.flush();
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}
