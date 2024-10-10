package Thread;

class Counter {
	int count = 0;

	public void increment() {
		count++;
	}

	// to over come the race condition we need to use the synchronized
//	public synchronized void increment() {
//		count++;
//	}

}

class MyThread extends Thread {
	Counter counter;

	MyThread(Counter counter) {
		this.counter = counter;
	}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			counter.increment();
		}
	}
}

public class RaceCondition {

	public static void main(String[] args) throws InterruptedException {

		Counter counter = new Counter();

		MyThread t1 = new MyThread(counter);
		MyThread t2 = new MyThread(counter);

		t1.start();
		t2.start();

		t1.join(); // Wait for thread 1 to finish
		t2.join(); // Wait for thread 2 to finish

		System.out.println("Final count: " + counter.count);

	}

}
