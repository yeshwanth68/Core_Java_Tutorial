package FinalKeyword;

class fnmethod{
	public final void show() {
		System.out.println("This is final method...");
	}
	
	public void add(int a, int b) {
		System.out.println("Add= "+(a+b));
	}
}

class afn extends fnmethod{
	//public void show() {
	//	System.out.println("This is normal method..."); here will show error final method can't override
	//}
}

public class FinalMethod {

	public static void main(String[] args) {
		
		fnmethod fn = new fnmethod();
		fn.show();
		fn.add(5, 5);
		

	}

}
