package example3;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo {

	public static void main(String[] args) {
//		Stack<Integer> num = new Stack<>();
//		num.push(10);
//		num.push(20);
//		num.push(30);
//		num.push(40);
//		System.out.println(num);
//		
//		while(! num.isEmpty()) {
//			System.out.println(num.pop());
//			
//		}
//
//		
//		Queue<String> name = new LinkedList<>();
//		name.add("aaa");
//		name.add("bbb");
//		name.add("ccc");
//		System.out.println(name);
//		while(! name.isEmpty()) {
//			System.out.println(name.poll());
//			
//		}
//		
//		
//		HashSet<Integer> obj = new HashSet<>();
//		obj.add(10);
//		obj.add(20);
//		obj.add(30);
//		obj.add(40);
//		obj.add(50);
//		for(Integer num:obj) {
//			System.out.println(num);
//		}
		
//		more efficient than hashset sequence manner
//		LinkedHashSet<Integer> obj1 = new LinkedHashSet<>();
//		obj1.add(10);
//		obj1.add(20);
//		obj1.add(30);
//		obj1.add(40);
//		obj1.add(50);
//		for(Integer num:obj1) {
//			System.out.println(num);
//		}
//		alphabetical order,ascending order of integer
//		
//		TreeSet<String> obj2 = new TreeSet<>();
//		obj2.add("dog");
//		obj2.add("cat");
//		obj2.add("cow");
//		obj2.add("elephant");
//		obj2.add("lion");
//		for(String animal:obj2) {
//			System.out.println(animal);
//		}
//		
		HashMap<String,String> obj3 = new HashMap<>();
		obj3.put("India", "new delhi");
		obj3.put("xxx", "yyyy");
		obj3.put("aaaa", "bbb");
		System.out.println(obj3);
		
//		LinkedHashMap<String,String> obj4 = new LinkedHashMap<>();
//		obj4.put("India", "new delhi");
//		obj4.put("xxx", "yyyy");
//		obj4.put("aaaa", "bbb");
//		System.out.println(obj4);
		
		
		
	}

}
