package collection;

import java.util.ArrayList;

public class Test_02 {
	public static void main(String[] args) {
		Person p = new Person(100,"张三","xxx大学");
		Person p1 = new Person(101, "张思", "清华大学");
		Person p2 = new Person(102,"张武","北京大学");
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(p);
		list.add(p1);
		list.add(p2);
		for (int i = 0; i < list.size(); i++) {
			Person pp = list.get(i);
			if(pp.getId()==100){
				pp.setName("张作霖");
				pp.setSchool("黑河学院");
				//list.set(i, pp);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			Person pp = list.get(i);
			if(pp.getId()>100){
				list.remove(i);
				i--;
			}
		}
		for (int i = 0; i < list.size(); i++) {
			Person pp = list.get(i);
			System.out.println(pp.getId()+":"+pp.getName()+":"+pp.getSchool());
		}
	}
}
