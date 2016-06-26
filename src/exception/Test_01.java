package exception;

public class Test_01 {
	public static void main(String[] args) {
		String a =null;
		try {
			System.out.println("------");
			System.out.println("------");
			System.out.println("------");
			int alength = a.length();
			System.out.println("++++++");
			System.out.println("++++++");
			System.out.println("++++++");
			
		} catch (NullPointerException e) {
			System.out.println("发生空指针异常！");
		}finally{
			System.out.println("关闭资源");
		}
		System.out.println("********");
		System.out.println("********");
		System.out.println("********");

	}
}
