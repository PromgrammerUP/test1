package socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_01 {
	public static void main(String[] args) {
		ServerSocket  server;
		Socket client;
		try {
			server = new ServerSocket(6666);
			System.out.println("系统消息：服务器创建成功等待连接……");
			client = server.accept();
			System.out.println("系统消息：客户端已连接");
			InetAddress address = client.getInetAddress();
			String hostName = address.getHostName();
			String hostAddress = address.getHostAddress();
			System.out.println(hostAddress+":"+hostName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
