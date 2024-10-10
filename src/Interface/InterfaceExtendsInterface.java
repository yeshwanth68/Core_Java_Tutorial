package Interface;

interface A2{
	
	void show();
	void config();
}

interface B2{
	void run();
}

interface C extends B2{
	
}

class D implements A1,C{
	
	public void show() {
		System.out.println("in show");
	}
	
	public void config() {
		System.out.println("in config");
	}

	public void run() {
		System.out.println("in run");
	}
}



public class InterfaceExtendsInterface {

	public static void main(String[] args) {
		
		D obj = new D();
		
		obj.show();
		obj.config();
		obj.run();
		

	}

}
