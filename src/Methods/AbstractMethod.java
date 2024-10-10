package Methods;

abstract class Myabstract{
	abstract void display();
}

class myclass extends Myabstract{
	
	void display() {
		System.out.println("This is my abstract method...");
	}
	
}
public class AbstractMethod {

	public static void main(String[] args) {
		
		//Myabstract abs = new Myabstract(); // here we can't intantiated the abstract class
		myclass abs = new myclass();
		abs.display();

	}

}
