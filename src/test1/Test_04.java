package test1;

import javax.swing.JOptionPane;

public class Test_04 {
	public static void main(String[] args) {
//		String a = "abc";
//		String b = "abc";
//		String c = new String("abc");
//		String d = new String("abc");
//		System.out.println(d==c);
//		String a = "离离原上草";
//		char[] as = a.toCharArray();
//		for (int i = 0; i < as.length; i++) {
//			System.out.println(as[i]);
//		}
//		char[] bs = new char[]{'一','岁','一','枯','荣'};
//		String b = new String(bs);
//		System.out.println(b);
//		String a = JOptionPane.showInputDialog("请输入字符串");
//		char[] as = a.toCharArray();
//		char[] dest = new char[as.length];
//		for (int i = 0; i < as.length; i++) {
//			dest[dest.length-1-i] = as[i];
//		}
//		String newstr = new String(dest);
//		System.out.println(newstr);
		String a ="我爱北京天安门";
		String result ="";
		for(int i=0;i<a.length();i++){
			char c = a.charAt(i);
			String cStr = c+"";
			result = cStr + result;
		}
		System.out.println(result);
	}
}
