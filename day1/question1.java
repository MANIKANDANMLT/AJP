package lab1;

 class Hillstations{
	public void location() {
		System.out.println("location");
	}
	public void famousfor() {
		System.out.println("famous");
		
	}
	
}
class manali extends Hillstations{
	public void location() {
		System.out.println("manali");
	}
	public void famousfor() {
		System.out.println("abc");
		
	}
	
}
class mussoorie extends Hillstations{
	public void location() {
		System.out.println("mussoorie");
	}
	public void famousfor() {
		System.out.println("def");
		
	}
	
}
 class gulmarg extends Hillstations{
	public void location() {
		System.out.println("gulmarg");
	}
	public void famousfor() {
		System.out.println("xyz");
		
	}
	
}
public class question1 {

	public static void main(String[] args) {
		Hillstations h = new Hillstations();
		manali m = new manali();
		mussoorie mu = new mussoorie();
		gulmarg gu = new gulmarg();
		h.location();
		h.famousfor();
		m.location();
		m.famousfor();
		mu.location();
		mu.famousfor();
		gu.location();
		gu.famousfor();

	}

}
