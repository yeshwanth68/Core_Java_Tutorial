package Interface;

interface A {

	void show();

	void config();
	
	void pay();
}

class B implements A {

	public void show() {

		System.out.println("in show");

	}

	public void config() {

		System.out.println("in config");

	}

	@Override
	public void pay() {
		
		System.out.println("hi pay..");
		
	}

}

public class Interface {

	public static void main(String[] args) {

		B obj = new B(); // here we can't create the object for the interface
		obj.show();
		obj.config();

	}

}
