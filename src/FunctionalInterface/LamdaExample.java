package FunctionalInterface;

interface Shape{
	void draw();
}

class Rectangle implements Shape{
	
	public void draw() {
		System.out.println("rectangle draw");
	}
}

public class LamdaExample {

	public static void main(String[] args) {
		
//		Shape rectangle = () ->{
//			System.out.println("rectangle in lambda..");
//		};
		
		Shape rectangle = () -> System.out.println("rectangle in lambda..");
		
		rectangle.draw();
		


	}

}
