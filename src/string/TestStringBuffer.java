package string;

public class TestStringBuffer {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer();
		String a = "abc";
		str.append(a);
		System.out.println(str.toString());
		StringBuffer str1 = str.reverse();
		System.out.println(str1.toString());
	}
}
