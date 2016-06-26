package finalp;

public class Test_01 {
	public static void main(String[] args) {
		String name = C.PAGE_PAGENAME;
	}
}

class C{
	public static final String PAGE_PAGENAME = "无名氏";
	public final void A(){
		System.out.println("A方法被调用了");
	}
}

class B extends C{
	
	}
