package superp;

public class test01 {
	public static void main(String[] args) {
		Son s = new Son();
		s.getName();
		s.sayHello();
	}
}

class Father {
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void a(){
		System.out.println("father 中a方法被调用了");
	}
}

class Son extends Father {
	public String getName(){
	   return super.name;
	}
	public void sayHello(){
		super.a();
	}
}