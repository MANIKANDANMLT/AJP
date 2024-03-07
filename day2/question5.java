package lab2;

import java.util.ArrayList;

public class question5 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        
        int size = num.size();
        int total = 0;
        
        for (int i = 0; i < size; i++) {
            int x = num.get(i);
            if (x % 2 == 0) {
                total += x; 
            }
        }
        
        System.out.println(num);
        System.out.println("Sum of even numbers: " + total);
    }
}
