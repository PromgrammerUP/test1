package collection;

import java.util.ArrayList;

public class Test_01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("刘备");
		list.add("关羽");
		list.add("张飞");
		String s1 = list.get(1);
		System.out.println(s1);
		list.add(3, "吕布");
		System.out.println("---");
		list.set(1, "孙权");
		System.out.println(list.get(1));
		System.out.println("---");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---");
		list.remove(2);
		for(String s:list){
			System.out.println(s);
		}
		System.out.println("---");
	}
}
