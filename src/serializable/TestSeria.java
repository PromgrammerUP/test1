package serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import string.Test;

public class TestSeria {
	public void saveObj(String path,Account account){
		FileOutputStream  os = null;
		ObjectOutputStream oos = null;
		try {
			os = new FileOutputStream(path);
			oos = new ObjectOutputStream(os);
			oos.writeObject(account);
			oos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(os!=null){
					os.close();
				}
				if(oos!=null){
					oos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
//		Account account = new Account("中国移动","10086",2000);
//		new TestSeria().saveObj("F:/account.dat", account);
		InputStream is = null;
		ObjectInputStream iis = null;
		try {
			 is = new FileInputStream("F:/account.dat");
			 iis  = new ObjectInputStream(is);
			Account account = (Account)(iis.readObject());
			System.out.println(account.getName()+":"+account.getNumber()+":"+account.getMoney());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(is!=null){
					is.close();
				}
				if(iis!=null){
					iis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

