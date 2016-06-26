package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test_09 {
	public void fileCopy(String src,String dest) throws IOException,FileNotFoundException{
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);
		byte[] buff = new byte[100];
		int i=0;
		while((i=fis.read(buff))!=-1){
			fos.write(buff, 0, i);
			fos.flush();
		}
		fis.close();
		fos.close();
	}
	public static void main(String[] args) {
		Test_09 t = new Test_09();
		try {
			t.fileCopy("f:/a.txt", "f:/b.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			FileInputStream fis = new FileInputStream("f:/a.txt");
//			byte[] buff = new byte[16];
//			int i = 0;
//			while((i = fis.read(buff))!=-1){
//				System.out.write(buff, 0, i);
//			}
//			fis.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
