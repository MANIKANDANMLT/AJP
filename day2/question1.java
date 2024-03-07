package lab2;

import java.util.Arrays;
public class question1 {

	public static void main(String[] args) {
		int []num = {1,2,3,4,5};
		try {
		System.out.println(num[10]);
		}catch(Exception e) {
			System.out.println("Array index out of bound exception");
		}

	}

}
