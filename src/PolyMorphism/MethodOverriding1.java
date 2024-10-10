package PolyMorphism;

class parent{
	
	public void show() {
		System.out.println("This is parent class...");
	}
}

class subclass1 extends parent{
	
	public void show() {
		System.out.println("This is subclass1...");
	}
	
}

class subclass2 extends parent{
	
	public void show() {
		System.out.println("This is subclass2...");
	}
}

public class MethodOverriding1 {

	public static void main(String[] args) {
		
		parent p;
		
		p = new subclass1()	;
		p.show();
		p = new subclass2();
		p.show();

	}

}
