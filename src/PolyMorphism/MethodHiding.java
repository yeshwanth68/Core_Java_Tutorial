package PolyMorphism;

class pa {
	// Static method in the parent class
	public static void show() {
		System.out.println("Static method in Parent class");
	}

	// Non-static method in the parent class
	public void display() {
		System.out.println("Non-static method in Parent class");
	}
}

class ch extends pa {
	// Static method in the child class (hides the parent method)
	public static void show() {
		System.out.println("Static method in Child class");
	}

	// Non-static method in the child class (overrides the parent method)
	@Override
	public void display() {
		System.out.println("Non-static method in Child class");
	}

}

public class MethodHiding {

	public static void main(String[] args) {
		pa p = new pa();
		pa c = new ch();

		// Static method hiding: determined by the class reference (Parent)
		p.show(); // Outputs: "Static method in Parent class"
		c.show(); // Outputs: "Static method in Parent class" (not Child's method because
					// reference is Parent)

		// Non-static method overriding: determined by the object type (Child)
		p.display(); // Outputs: "Non-static method in Parent class"
		c.display(); // Outputs: "Non-static method in Child class" (overridden method)

	}

}
