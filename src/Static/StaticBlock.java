package Static;

class MobilePhone{
	String brand;
	int price;
	static String name;
	
	static {
		name="Phone";
		System.out.println("Inside the static block");
	}
	
	public MobilePhone() {
		brand ="";
		price = 200;
		System.out.println("Inside the Constructor");
		
	}
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
	}
	
}

public class StaticBlock {

	public static void main(String[] args) {
		
		MobilePhone mb1 = new MobilePhone();
		mb1.brand="Apple";
		mb1.name="Smartphone";
		
		MobilePhone mb2 = new MobilePhone();
		mb2.brand="Samsung";
		mb2.name="Smartphone";
		
		mb1.show();
		mb2.show();
		

	}

}
