package staticp;

import org.omg.Messaging.SyncScopeHelper;

public class Test_01 {
    public static void main(String[] args) {
//    	int c = Calculator.add(10, 20);
//    	System.out.println(c);
    	Person a = new Person();
    	Person a1 = new Person();
    	Person a2 = new Person();
    	Person a3 = new Person();

        Person.getCount();
    }
}

class Person{
	private static int count;
	public static void getCount()
	{
		System.out.println(count);
	}
	public Person(){
		count++;
	}
}
class Calculator {
	public static int add(int a, int b){
		return a+b;
	}
	public static int minus(int a, int b){
		return a+b;
	}
	public static  int multiple(int a , int b ){
		return a*b;
	}
}