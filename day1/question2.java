package lab1;

class Animal{
	public void makesound() {
		System.out.println("The animal makes a sound");
	}

	
}
class Dog extends Animal{
	public void makesound() {
		System.out.println("The dog barks");
	}

	
}
class Cat extends Animal{
	public void makesound() {
		System.out.println("The cat meow");
	}

	
}
public class question2 {

	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		a.makesound();
		d.makesound();
		c.makesound();

	}

}
