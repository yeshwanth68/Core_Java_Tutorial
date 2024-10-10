package Inheritance;

//Hybrid inheritance is a combination of two or more types of inheritance in Java. 
//It is not directly supported in Java due to the issue of multiple inheritance (i.e., a class cannot inherit from more than one class) 
//because it can lead to ambiguity when the same method exists in multiple parent classes. 
//However, hybrid inheritance can be achieved in Java using interfaces.

interface flyable{
	void fly();
}

class Birds implements flyable{
	public void fly() {
		System.out.println("Bird is flying...");
	}
}

class Airplane implements flyable{
	public void fly() {
		System.out.println("Airplane is flying");
	}
}

class Airbus extends Airplane{
	public void fly() {
		System.out.println("The airbus is flying");
	}
	
}

public class HybridInheritance {

	public static void main(String[] args) {
		
		flyable obj1 = new Birds();
		flyable obj2 = new Airplane();
		flyable obj3 = new Airbus();
		obj1.fly();
		obj2.fly();
		obj3.fly();
		
		

	}

}
