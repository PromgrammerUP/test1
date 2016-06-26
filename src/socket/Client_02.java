package socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client_02 {
	public static void main(String[] args) {
		try {
			Socket client = new Socket("localhost", 6666);
			System.out.println("客户端到服务器的连接建立成功……");
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
}
