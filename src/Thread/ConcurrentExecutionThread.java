package Thread;

class Task1 extends Thread {
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Task 1 - Count: " + i);
		}
	}
}

class Task2 implements Runnable {
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Task 2 - Count: " + i);
		}
	}
}

public class ConcurrentExecutionThread {

	public static void main(String[] args) {

		Task1 t1 = new Task1();
		Thread t2 = new Thread(new Task2());

		t1.start(); // Start Task1
		t2.start(); // Start Task2
	}

}
