package Constructor;

public class ParameterisedConstructor {
	String name;
	int rollNo;
	String className;
	boolean isFromCity;

	ParameterisedConstructor(String name, int rollNo, String className, boolean isFromCity) {
		this.name = name;
		this.rollNo = rollNo;
		this.className = className;
		this.isFromCity = isFromCity;
	}

	public void studentData() {
		System.out.println("Name of Student = " + name);
		System.out.println("Roll no = " + rollNo);
		System.out.println("Class Name = " + className);
		System.out.println("Is student belongs to city = " + isFromCity);
	}

	public static void main(String[] args) {
		ParameterisedConstructor student1 = new ParameterisedConstructor("Yeshwanth", 1, "MCA", false);
		student1.studentData();

		ParameterisedConstructor student2 = new ParameterisedConstructor("Vishal", 2, "MCA", true);
		student2.studentData();

	}

}
