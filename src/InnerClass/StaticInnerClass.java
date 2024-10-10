package InnerClass;

class A1{
	
	int age;
	public void show() {
		System.out.println("in show");
	}
	
	static class B1{
		
		public void config()
		{
			System.out.println("in config");
		}
		
	}
}

public class StaticInnerClass {
	
	public static void main(String args[]) {
		
		A1.B1 obj = new A1.B1();
		
		obj.config();

	}

}
