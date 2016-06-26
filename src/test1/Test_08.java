package test1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test_08 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("f:/a.txt",true);
			String str = "好后学习，天天向上";
			byte[] buff = str.getBytes();
			fos.write(buff);
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
