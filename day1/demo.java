package example1;

public class demo {
	//OVERLOADING
	public void display(String name,int age) {
		System.out.println("name : "+name+" "+"age : "+age);
	}
	public void display(String dept) {
		System.out.println("department : "+dept);
	}
	public static void main(String[] args) {
		demo d = new demo();
		d.display("sneha",21);
		d.display("CSE");
	}

}
