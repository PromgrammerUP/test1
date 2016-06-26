package test1;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		//对象.属性可以取到属性并且可以个属性赋值。
		
		//调用p1对象的方法：对象名.方法名（）
		p1.talk();
		
		//调用带参数的方法
		String name = "hhhaaa";
		p1.sayHello(name);
//		p1.age = 3;
//		int p1Age = p1.age;
//		System.out.println(p1Age);
		
//		简单数据类型如果没有设置初值则默认为0.
//		引用数据类型如果没有设置初值，则默认为null；
		Person p2 = new Person();

	}

}
