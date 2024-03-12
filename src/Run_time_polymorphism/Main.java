package Run_time_polymorphism;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Dog();
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		dog.makeSound();
		cat.makeSound();
	}

}
