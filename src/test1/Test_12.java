package test1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test_12 {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("f:/a.txt",true);
			bw = new BufferedWriter(fw);
			//fw.write("秋风清，秋月明。\r\n落叶聚还散,寒鸦栖复惊。\r\n相知相见知何日，此时此夜难为情。\r\n");
			//fw.flush();
			bw.write("坦白从宽");
			bw.newLine();
			bw.write("抗拒从严");
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(bw!=null){
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fw!=null){
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
