package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_02 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(6666);
			Socket client = server.accept();
			InetAddress address = client.getInetAddress();
		    String ipaddress = address.getHostAddress();
		    System.out.println("【系统消息】欢迎来自"+ipaddress+"的游客");
		    InputStream is = client.getInputStream();
		    InputStreamReader ir = new InputStreamReader(is);
		    BufferedReader br = new BufferedReader(ir);
		    String line = null;
		    while((line = br.readLine())!=null){
		    	System.out.println(ipaddress+":"+line);
		    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
