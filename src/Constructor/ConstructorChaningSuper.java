package Constructor;

class Animal {
	String name;

	// Superclass constructor
	Animal(String name) {
		this.name = name;
		System.out.println("Animal constructor called.");
	}
}

class Dog extends Animal {
	String breed;

	// Subclass constructor
	Dog(String name, String breed) {

		super(name); // Calling superclass constructor
		this.breed = breed;
		System.out.println("Dog constructor called.");
	}

	void display() {
		System.out.println("Name: " + name + ", Breed: " + breed);
	}
}

public class ConstructorChaningSuper {

	public static void main(String[] args) {
		Dog dog = new Dog("Buddy", "Golden Retriever"); // Calls Dog constructor
		dog.display();

	}

}
