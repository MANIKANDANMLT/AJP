package example4;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
public class lab4 {

	public static void main(String[] args) {
		System.out.println("qno1.MIN and MAX in a list");
		ArrayList<Integer> num = new ArrayList<>();
		num.add(100);
		num.add(50);
		num.add(10);
		num.add(44);
		num.add(100);
		System.out.println(num);
		Collections.sort(num,Comparator.naturalOrder());
		System.out.println("min of the list is "+num.get(0));
		Collections.sort(num,Comparator.reverseOrder());
		System.out.println("max of the list is "+num.get(0));
		System.out.println("_______________________________________________________________________________");
		System.out.println("qno2.Split a list into two halves");
		int len = num.size();
		int mid = len/2;
		System.out.println(num);
		System.out.println("First half"+num.subList(0, mid));
		System.out.println("second half"+num.subList(mid,len));
		System.out.println("_______________________________________________________________________________");
		System.out.println("qno3.Remove Duplicates in arraylist");
		System.out.println(num);
		Set<Integer> s = new HashSet<Integer>();
        for(Integer n : num) {
            if(s.add(n) == false)
                System.out.println(n + " is duplicated");
        }
        
		System.out.println("after remove duplicates ");
		System.out.println(s);
		

	}

}
