package FunctionalInterface;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	void print(String msg);  // contains only functional interface

	default void run() {
		System.out.println("default method");
	}
	
	static void m2()
	{
		System.out.println("static method");
	}
}
