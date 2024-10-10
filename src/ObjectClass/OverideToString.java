package ObjectClass;

class person{
	
	String name;
    int age;

    person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
	
}

public class OverideToString {

	public static void main(String[] args) {
		
		person p = new person("Yeshwanth", 25);
        System.out.println(p.toString());  // Output: Person{name='Alice', age=30}

	}

}
