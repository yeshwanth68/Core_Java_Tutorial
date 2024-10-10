package Constructor;

class Constructor{
	
	String name;
	int age;
	int marks;
	
	Constructor(String name){
		this.name = name;
		System.out.println("This is first constructor= "+name);
	}
	
	Constructor(String name, int age, int marks){
		this.name = name;
		this.age = age;
		this.marks = marks;
		System.out.println("This is second constructor= "+name+" ,Age= "+age+" ,Marks= "+marks);
		
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Constructor c1= new Constructor("Yeshwanth");
		Constructor c2= new Constructor("Vishal",25,99);

	}

}
