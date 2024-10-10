package FinalKeyword;

final class fi{
	public void show() {
		System.out.println("This is final class's method...");
	}
}

//class sub extends fi{  // here final class can't be inherited
	
//}

public class FinalClass {

	public static void main(String[] args) {
		
		fi obj = new fi();
		obj.show();

	}

}
