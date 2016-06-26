package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("张三");
//		list.add("100");
//		list.add(0, "李四");
//		Iterator<String> it =list.iterator();
//		while(it.hasNext()){
//			String str = it.next();
//			System.out.println(str);
//		}
//		HashSet<String> set1 = new HashSet<String>();
//		
//		set1.add("张三");
//		set1.add("李四");
//		Iterator<String> it = set1.iterator();
//		while (it.hasNext()) {
//			String st = it.next();
//			System.out.println(st);
//		}
//		System.out.println(set1.size());
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("aaa", 10);
		map1.put("bbb", 20);
		map1.put("ccc", 30);
		Set<String> set1 = map1.keySet();
		for (String key : set1) {
			int value = map1.get(key);
			System.out.println(key+":"+value);
		}
		
	}
}
