package reflect;

public class Person {
	private String sid;
	private String name;
	private int age;
	public String getSid() {
		return sid;
	}
	public Person(String sid, String name, int age) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
		System.out.println("带参数的构造器被调用了！name="+name);
	}
	private Person() {
		super();
		System.out.println("无参构造器被调用了!");
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("set name method is invoked");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
