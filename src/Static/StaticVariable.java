package Static;

class Mobile{
	
	String brand;
	int price;
	static String name;	
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
		
	}
}
public class StaticVariable {

	public static void main(String[] args) {
		
		Mobile obj1 = new Mobile();
		obj1.brand="Apple";
		obj1.price=50000;
		obj1.name="Smartphone";
		
		Mobile obj2 = new Mobile();
		obj2.brand="Samsung";
		obj2.price=60000;
		obj2.name="Smartphone";
		
		obj1.show();
		obj2.show();
		
		obj1.name="Phone";
		System.out.println(Mobile.name);  // we can access by the Classname.staticvariable
		
		System.out.println("After change");
		
		obj1.show();
		obj2.show();
		
		

	}

}
