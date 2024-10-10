package Static;

class Mobilestatic{
	
	public static void show() {
		System.out.println("Inside the static method");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		
		//StaticMethod.show(); it show error
		Mobilestatic.show();
	

	}

}
