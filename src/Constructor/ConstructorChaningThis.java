package Constructor;

class Employee {
	String name;
	int age;
	String department;

	// Constructor 1: No parameters
	Employee() {
		// Calling the parameterized constructor from this constructor
		this("Unknown", 0, "None");
		System.out.println("Default constructor called.");
	}

	// Constructor 2: Two parameters
	Employee(String name, int age) {
		this(name, age, "General"); // Calling another constructor
		System.out.println("Two-parameter constructor called.");
	}

	// Constructor 3: Three parameters (fully parameterized constructor)
	Employee(String name, int age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
		System.out.println("Three-parameter constructor called.");
	}

	void display() {
		System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
	}
}

public class ConstructorChaningThis {

	public static void main(String[] args) {
		Employee emp1 = new Employee(); // Calls the default constructor
		emp1.display();

		Employee emp2 = new Employee("Alice", 25); // Calls the two-parameter constructor
		emp2.display();

		Employee emp3 = new Employee("Bob", 30, "IT"); // Calls the fully parameterized constructor
		emp3.display();

	}

}
