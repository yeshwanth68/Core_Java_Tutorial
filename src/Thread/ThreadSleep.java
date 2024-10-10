package Thread;

class C extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Hi");
		}
	}
}

class D extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("hello");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

public class ThreadSleep {

	public static void main(String[] args) {

		C obj1 = new C();
		D obj2 = new D();

		obj1.run();

		try {

			Thread.sleep(100);

		} catch (Exception e) {

		}
		System.out.println("Thread is waiting...");
		obj2.run();

	}

}
