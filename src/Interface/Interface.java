package Interface;

interface A {

	void show();

	void config();
}

class B implements A {

	public void show() {

		System.out.println("in show");

	}

	public void config() {

		System.out.println("in config");

	}

}

public class Interface {

	public static void main(String[] args) {

		B obj = new B(); // here we can't create the object for the interface
		obj.show();
		obj.config();

	}

}
