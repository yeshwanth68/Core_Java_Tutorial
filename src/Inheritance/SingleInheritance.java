package Inheritance;

class Animal{
	public void eat() {
		System.out.println("Animal is eating...");
	}
}

class Dog extends Animal{
	public void bark() {
		System.out.println("Dog is barking.....");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		
//		Animal obj = new Animal();  // here we can create the object of super class but we can't access the subclass
//		obj.eat();  
//		obj.bark(); // to access the child class we can create the object for child class and then we can able to access the methods in parent class
		
		Dog obj = new Dog();
		obj.eat();
		obj.bark();

	}

}
