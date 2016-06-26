package thread;

import java.util.Date;
import java.util.Scanner;

import javax.swing.plaf.SliderUI;

public class Test_04 {
	public static void main(String[] args) {
		TimeTsk tsk = new TimeTsk();
		tsk.start();
//		try {
//			Thread.sleep(1000*3);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String input = scan.nextLine();
			System.out.println("您输入的是："+input);
		}
	}
}

class TimeTsk extends Thread{
	public void run(){
		while(true){
			Date t = new Date();
		System.out.println(t);
		try {
			Thread.sleep(1000*10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 }
}
