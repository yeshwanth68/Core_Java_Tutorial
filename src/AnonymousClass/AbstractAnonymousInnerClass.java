package AnonymousClass;

abstract class A1{
	public abstract void show();
	public abstract void config();

}

public class AbstractAnonymousInnerClass {

	public static void main(String[] args) {
		
		A1 obj = new A1() {
			
			public void show()
			{
				System.out.println("in show");
			}
			
			public void config() {
				System.out.println("in config");
			}
		};
		
		obj.show();
		obj.config();
		

	}

}
