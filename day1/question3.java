package lab1;

public class question3 {

	public static void main(String[] args) {
		String test = "madam";
		String reverseStr = "";
	    
	    int strLength = test.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + test.charAt(i);
	    }
        if ((reverseStr).equals(test)) {
        	System.out.println("madam is palindrome");
        }
        else {
        	System.out.println("madam is not palindrome");

        }
	}

}
