package lab3;

import java.util.HashMap;

public class question3 {

	public static void main(String[] args) {
		HashMap<String,Integer> cricket = new HashMap<>();
		cricket.put("dhoni",95);
		cricket.put("virat",100);
		cricket.put("gayle",130);
		cricket.put("rohit",80);
		cricket.put("watson",90);
		
		String batsman = "virat";
		if(cricket.containsKey(batsman)) {
			System.out.println(batsman +" scored : "+cricket.get(batsman)+" runs");
		}
		else {
			System.out.println("batsman not found");
		}

	}

}
