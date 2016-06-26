package test1;

/*
 * 规范，类的首字母大写，如果类名由多个单子组成，则每个单词字母都要大写
 */
public class Person {
	//属性名和方法名，首字母小写，如果由多个单词组成，则从第二个单词字母开始大写
	//private-->修饰符 （私有的，其他类不能直接访问）
	//属性可以有默认值 
	//属性由 修饰符+属性类型+属性名 +[默认值]
	
	
	private String name;
	String sex;
	int age;
	double height;
	double weight;
	//java 中的方法 
	// 修饰符+返回值类型+方法名+（[参数列表]）-->(signature){}
	public void talk() {
		System.out.println("我在说话");
	}
	
	public void walk() {
		System.out.println("我在走路");
	}
	
	public void calculate(){
		System.out.println("能计算");
	}
	
	public void sayHello(String someBody){
		System.out.println("good morning "+someBody);
	}
}
