package AccessModifiers;

class PublicExample {
    public String message = "I am public";

    public void showMessage() {
        System.out.println(message);
    }
}

public class Public {

	public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        obj.showMessage();  // Accessible from anywhere
    }

}
