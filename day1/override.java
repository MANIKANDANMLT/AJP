package example1;

public class demo {
	
	public void display() {
		System.out.println("hello world");
	}
	}

public class override extends demo{
	public void display() {
		System.out.println("hello everyone");
	}

	public static void main(String[] args) {
		override o = new override();
		o.display();

	}

}
