package example4;


import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
public class comparator {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		num.add(100);
		num.add(50);
		num.add(10);
		num.add(44);
		num.add(100);
		Collections.sort(num,Comparator.naturalOrder());
		System.out.println(num);

	}

}
