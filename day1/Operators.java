package example1;


public class Operators {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
//		arithmetic operators
		System.out.println("Addition :"+(a+b));
		System.out.println("subtraction :"+(a-b));
		System.out.println("multiplication :"+(a*b));
		System.out.println("division :"+(a/b));
		System.out.println("modulus :"+(a%b));
		
//		unary operators
		a++;
		--b;
		System.out.println(a);
		System.out.println(b);
//		assingment  operators
		a = 100;
		b *= 2;
		System.out.println(a);
		System.out.println(b);
//		relational   operators
		if (a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
//		logical    operators
		boolean x = true;
		boolean y = false;
		if (x&&y) {
			System.out.println("x and y are true");
		}
		else {
			System.out.println("anyone or both are false");
		}
//		ternary    operators
		int max;
		int ex1 = 10;
		int ex2 = 20;
		max = (ex1>ex2) ? ex1:ex2;
		System.out.println("greatest number is : "+max);
//		bitwise    operators
		int l = 2;
        System.out.println("l ^= 1010: " + (l ^= 1010));
//		shift    operators
        int m = 2;
        System.out.println("m <<= 2: " + (m <<= 2));

	}

}
