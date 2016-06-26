package wrapper;

public class Test_01 {
    public static void main(String[] args) {
		Integer i = new Integer("123");
		int  a = i.intValue();
		int b = Integer.parseInt("456");
		System.out.println(a+":"+b);
	}
}
