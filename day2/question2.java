package lab2;

import java.util.ArrayList;
public class question2 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		for (int i = 1;i <= 100;i++) {
			num.add(i);
		}
		System.out.println(num);
		for (int i = 1;i < 100;i++) {
			System.out.println(num.get(i));
		}
		

	}

}
