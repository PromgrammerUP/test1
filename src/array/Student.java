package array;

public class Student implements Comparable{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		Student s = (Student)o;
		int toAge = s.getAge();
		if(this.age>toAge){
			return 1;
		}
		if(this.age==toAge){
			return 0;
		}
		return -1;
	}
	
}
