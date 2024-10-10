package Thread;

class A {

	public void show() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Hi");
		}
	}
}

class B {

	public void show() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("hello");
		}
	}
}

public class ProgramExample {

	public static void main(String[] args) {

		A obj1 = new A();
		B obj2 = new B();

		obj1.show();
		obj2.show();

	}

}
