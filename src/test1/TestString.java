package test1;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	创建字符串的方式
	//  字符串创建方式1. new String() --> 堆存储
	String a = new String();
	String b = new String("abc");//b和g 指向不同的堆空间
	String g = new String("abc");
	
	//字符串创建方式2. 直接赋值方式-->栈存储（string池）（先查找，如果没有找到，则创建。如果找到对应的值，则直接赋值）
	
	String c = "abc";//c和d指向同一块栈空间
	String d = "abc";
	String e = "bcd";
	
	//字符串连接,耗费资源（时间和内存）
	String f = "abcd";//String池中创建abcd
	f = f+"e"; //f现在的值--》abcde ,如果没有会重新创建一个字符串abcde而不会直接在abcd后加e.
			   //因此这种连接方式耗费资源，应尽量避免使用
	String h = "Hello JavaChina";
	char i = h.charAt(0);//charAt函数的参数为字符串的索引，索引从零开始。
	//char字符和ascii码表中的数字一一对应
	//concat():字符串连接，比使用"+"操作快
	h = h.concat("ok");
//	System.out.println(h);
	boolean isContain = h.contains("hello");
//	System.out.println(isContain);
	
	// equals()：判断字符串的值是否相等
		boolean isEqual = b.equals(d);
//		System.out.println(isEqual);
	//比较字符串的内存地址
//	System.out.println(b == d);
//format(String format,Object...args)使用指定的格式字符串和参数返回一个格式化字符串，执行速度快
	String j = "I love %s,%s";
	String k = "kate";
	String m = "linda";
	String l = String.format(j, k,m);
//	System.out.println(l);
	//indexof()
	int indexh = h.indexOf('e');
	//replace(char oldChar, char newChar）
	//replace(String oldstr, String newstr);
	String newStr = h.replace("Java", "zzzz");

	System.out.println(h.substring(6, 15));
	}

}
