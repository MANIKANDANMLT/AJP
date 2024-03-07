package example2;

import java.util.ArrayList;

public class demo {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("grapes");
		fruits.add("orange");
		fruits.add("banana");
		System.out.println(fruits);
		System.out.println(fruits.get(10));
		fruits.remove(3);
		System.out.println(fruits);
		fruits.set(1, "mango");
		System.out.println(fruits);

	}

}
