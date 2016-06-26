package staticp;

//public class Test_02 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//       C c = new C();
//	}
//
//class C{
//	public C(){
//		System.out.println("c的构造方法被执行了");
//	}
//	{
//		System.out.println("C的普通自由块被执行了");
//	}
////	static {
////		System.out.println("C的静态自由快被执行了");
////	}
//	
//}
//	
//}
public class Test_02 {

	public static void main(String[] args) {
		C c = new C();
		C c2 = new C();
	}
}

class C {
	
	//给静态属性赋值
	//执行时机:在类模型载入到内存的时候，先检测是否存在静态自由块，如果有则执行之 
	//	       执行完之后， 静态自由块逻辑消失
	//因为类模型载入内存就一次，所以静态自由块执行也就一次
	//主要作用:给静态属性赋值
	static {
		System.out.println("C的静态自由块被执行了....");
	}
	
	{
		System.out.println("C的普通自由块被执行了...");
	}
	
	public C (){
		System.out.println("C的构造器被执行了....");
	}
	
	
}
