package Enum;

enum laptop{
	
	MackBook(100000), HP(50000), Lenevo(30000), XPS(20000);
	
	private int price;

	private laptop(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
		
	}
}

public class CreateOwnClass {

	public static void main(String[] args) {
		
		laptop lap = laptop.MackBook;
		System.out.println(lap+" : "+lap.getPrice());
		
		for(laptop la: laptop.values()) {
			
			System.out.println(la+" : "+la.getPrice());
			
		}

	}

}
