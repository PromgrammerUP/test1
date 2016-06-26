package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test_03 {
	public void cun() throws FileNotFoundException{
		try {
			FileInputStream fis = new FileInputStream("c:/a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}
	public void xiang() throws FileNotFoundException{
		this.cun();
	}
	public void xian() throws FileNotFoundException{
		this.xiang();
	}
	public void sheng() throws FileNotFoundException{
		this.xian();
	}
	public static void main(String[] args) {
		Test_03 t  = new Test_03();
		try {
			t.sheng();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("文件未找到");
		}
	}
}
