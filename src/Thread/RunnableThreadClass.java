package Thread;

class E implements Runnable {

	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("hi");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

public class RunnableThreadClass {

	public static void main(String[] args) {

		Runnable obj1 = () -> {

			for (int i = 0; i <= 10; i++) {
				System.out.println("hello");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable obj2 = new E();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
		

	}

}
