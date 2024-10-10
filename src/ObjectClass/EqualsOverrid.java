package ObjectClass;

class person1{
	
	String name;
	int age;
	
	person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
	
	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        person1 person = (person1) obj;
	        return age == person.age && name.equals(person.name);
	    }
}

public class EqualsOverrid {

	public static void main(String[] args) {
		
		person1 p1 = new person1("Yeshwanth", 30);
		person1 p2 = new person1("Yeshwanth", 30);
        System.out.println(p1.equals(p2));

	}

}
