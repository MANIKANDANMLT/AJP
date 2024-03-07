package example4;

import java.util.LinkedList;
public class qno4 {

	public static void main(String[] args) {
		LinkedList<Integer> num = new LinkedList<>();
		num.add(25);
		num.add(45);
		System.out.println(num);
		System.out.println("Add element at first");
		num.addFirst(10);
		System.out.println(num);
		System.out.println("Add element at last");
		num.addLast(50);
		System.out.println(num);
		

	}

}
