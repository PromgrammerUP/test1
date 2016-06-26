package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test_02 {
	public static void main(String[] args) {

			try {
				FileInputStream fi = new FileInputStream("F:/c.txt");
			} catch (FileNotFoundException e) {
				System.out.println("文件没找到");
			}
		
	}
}
