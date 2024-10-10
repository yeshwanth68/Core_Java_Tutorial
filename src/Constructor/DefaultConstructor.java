package Constructor;

public class DefaultConstructor {

	int rollNo;
	String className;
	boolean isFromCity;

	public void DefaultConstructor() {
		System.out.println("This is default constructor of class provides default values");
		System.out.println("Roll no = " + rollNo);
		System.out.println("Class Name = " + className);
		System.out.println("Is student belongs to city = " + isFromCity);
	}

	public static void main(String arg[]) {
		// Creating a object that will call the default constructor
		DefaultConstructor newStudent = new DefaultConstructor();
		newStudent.DefaultConstructor();
	}

}
