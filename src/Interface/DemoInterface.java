package Interface;

interface computer{
	void code();
}

class Laptop implements computer{
	public void code() {
		System.out.println("code, compile, run");
	}
}

class Desktop implements computer{
	public void code() {
		System.out.println("code, compile, run faster");
	}
}

class Developer{
	public void devApp(computer lap) {
		lap.code();
	}
}

public class DemoInterface {

	public static void main(String[] args) {
		
		computer lap = new Laptop();
		computer desktop = new Desktop();
		Developer yesh = new Developer();
		yesh.devApp(lap);
		yesh.devApp(desktop);
		
	}

}
