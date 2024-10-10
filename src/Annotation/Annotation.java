package Annotation;

class A{
	public void showthedata() {
		System.out.println("in A show");
	}
}

class B extends A{
	@Override
	public void showthedata() {
		System.out.println("in B show");
	}
	
}

public class Annotation {

	public static void main(String[] args) {
		
		B obj = new B();
		A obj1 = new A();		
		obj.showthedata();
		obj1.showthedata();

	}

}
