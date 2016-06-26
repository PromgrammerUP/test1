package test1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test_07 {
	public static void main(String[] args) {
		FileInputStream	fis=null;
		try {
			fis = new FileInputStream("F:/a.txt");
			byte[] buffer = new byte[16];
			int i = 0;
			while((i = fis.read(buffer))!=-1){
			String rb = new String(buffer,0,i);
			System.out.print(rb);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}finally {
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
