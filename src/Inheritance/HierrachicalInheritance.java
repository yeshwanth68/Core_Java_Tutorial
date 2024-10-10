package Inheritance;

class Animals{
	public void eat() {
		System.out.println("The animal is eating....");
	}
}

class Dogs extends Animals{
	public void bark() {
		System.out.println("Dog is barking....");
	}
}

class Cat extends Animals{
	public void meow() {
		System.out.println("Cat is meowing....");
	}
}

public class HierrachicalInheritance {

	public static void main(String[] args) {
		
		Dogs dog = new Dogs();
        dog.eat();  // Inherited from Animal
        dog.bark(); // Defined in Dog

        Cat cat = new Cat();
        cat.eat();  // Inherited from Animal
        cat.meow(); // Defined in Cat
	}

}
