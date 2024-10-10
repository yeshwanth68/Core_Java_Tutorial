package Abstraction;

abstract class Car{
	
	public abstract void drive();
	public abstract void fly();
	
	public void playmusic() {
		System.out.println("Play Music....");
	}
}

class Hyndai extends Car{

	@Override
	public void drive() {
		System.out.println("Driving....");  // here abstraction method implementation should be in the child class
	}

	@Override
	public void fly() {
		System.out.println("Flying....");
	}
	
}

public class Abstraction1 {

	public static void main(String[] args) {
		
		//Car obj = new Car(); // abstract class can't be instantiated
		
		Car obj = new Hyndai();
		obj.drive();
		obj.fly();
		obj.playmusic();
		
		
		

	}

}
