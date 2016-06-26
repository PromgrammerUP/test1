package test1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test_11 {
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			 reader = new FileReader("f:/a.txt");

			
			char[] buff = new char[8];
			int i = 0;
			while((i = reader.read(buff))!=-1){
				for(int j=0;j<i;j++){
					System.out.print(buff[j]);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(reader!=null){
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
