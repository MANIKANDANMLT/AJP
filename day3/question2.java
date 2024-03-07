package lab3;

import java.util.HashMap;
public class question2 {

	public static void main(String[] args) {
		HashMap<Integer,String> studentids = new HashMap<>();
		studentids.put(1, "name1");
		studentids.put(2, "name2");
		studentids.put(3, "name3");
		
		boolean isempty = studentids.isEmpty();
		if (isempty) {
		System.out.println("Hash Map is empty");
		}
		else {
			System.out.println("Hash Map is not empty");
			
		}

	}

}
