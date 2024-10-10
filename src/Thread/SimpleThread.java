package Thread;

class A1 extends Thread {

	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Hi");
		}
	}
}

class B1 extends Thread {

	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("hello");
		}
	}
}

public class SimpleThread {

	public static void main(String[] args) {
		
		A1 obj1 = new A1();
		B1 obj2 = new B1();
		
//		obj1.run();
//		obj2.run();
		
		System.out.println(obj1.getPriority());
		System.out.println(obj2.getPriority());
		obj1.setPriority(1);
		obj2.setPriority(Thread.MAX_PRIORITY);
		obj1.start();
		obj2.start();
		
		
		
		

	}

}
