package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client_05 {
	public  void startClient(String ip,int port) {
		try {
			Socket client = new Socket(ip, port);
			System.out.println("客户端到服务器的连接建立成功……");
			BroadCastClient bb = new BroadCastClient(client);
			bb.start();
			OutputStream os = client.getOutputStream();
			PrintStream ps  = new PrintStream(os);
			Scanner scan = new Scanner(System.in);
			while (scan.hasNext()) {
				String input  = scan.next();
				if(input.equalsIgnoreCase("exit")){
					break;
				}
				ps.println(input);
				ps.flush();
			}
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  class BroadCastClient extends Thread{
	  private Socket c;
	  public BroadCastClient(Socket server){
		  this.c = server;
	  }
	  public void run(){
		 try {
			InputStream is = c.getInputStream();
			 InputStreamReader ir = new InputStreamReader(is);
			 BufferedReader br = new BufferedReader(ir);
			 String line=null;
			 while((line=br.readLine())!=null){
				 System.out.println(line);
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
  }
  public static void main(String[] args) {
	Client_05 c = new Client_05();
	c.startClient("localhost", 6666);
}
}
