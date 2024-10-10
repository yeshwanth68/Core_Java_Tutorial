package Methods;

class Methods{
	
	public void string() {
		System.out.println("This is void method");
	}
	
	public void add(int a,int b) {
		int result = a+b;
		System.out.println("result="+result);
	}
	
	static void greet(String name) {
		System.out.println("Name="+name);
	}
	
}
public class VoidMethods {

	public static void main(String[] args) {
		
		Methods ms = new Methods();
		ms.string();
		ms.add(10,10);
		ms.greet("Yeshwanth");
		
		

	}

}
