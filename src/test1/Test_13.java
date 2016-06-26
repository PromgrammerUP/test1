package test1;

import java.util.Scanner;

public class Test_13 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		while (sca.hasNext()) {
			String input = sca.next();
			System.out.println("你输入的是："+input);
			if("exit".equalsIgnoreCase(input)){
				break;
			}
		}
	}
}
