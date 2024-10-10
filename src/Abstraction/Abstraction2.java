package Abstraction;

abstract class car2{
	abstract void drive();
	abstract void fly();
	
	public void playmusic() {
		System.out.println("Playing music...");
	}
}

abstract class waganor extends car2{
	
	public void drive() {
		System.out.println("Driving....");
	}
}

class updatedwaganor extends waganor{

	@Override
	public void fly() {
		System.out.println("Flying....");
	}
}

public class Abstraction2 {

	public static void main(String[] args) {
		
		//car2 obj = new waganor();  // this not instantiated due the class is abstract
		
		car2 obj = new updatedwaganor();
		
		obj.drive();
		obj.fly();
		obj.playmusic();
		



	}

}
