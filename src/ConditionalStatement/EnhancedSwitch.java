package ConditionalStatement;

public class EnhancedSwitch {

	public static void main(String[] args) {
		String fruit = "Mango";
		switch(fruit) {
		case "Mango" -> System.out.println("Mango");
		case "Apple" -> System.out.println("Apple");
		case "Papaya" -> System.out.println("Papaya");
		default -> System.out.println("fruits");
		}
	}
}
