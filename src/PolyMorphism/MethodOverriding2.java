package PolyMorphism;

class A{
	public void show() {
		System.out.println("This is class A....");
	}
}

class B extends A{
	public void show() {
		System.out.println("This is class b....");
	}
}

class c extends A{
	public void show() {
		System.out.println("This is class c....");
	}
}

public class MethodOverriding2 {

	public static void main(String[] args) {
		
		A obj = new A();
		obj.show();
		
		obj = new B();  // here assigning new object to the old variable
		obj.show(); 

	}

}
