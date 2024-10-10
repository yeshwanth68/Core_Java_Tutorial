package OOPs_Class_and_Object;

public class Mainclass {

	public static void main(String[] args) {
		
		int num1=2;
		int num2=5;
		
		Calculator cs = new Calculator();  // object creation 
		cs.add();
		
		System.out.println(cs.add(10,20)); 
		System.out.println(cs.add(num1,num2)); 
		
		int resutl = cs.add(num1,num2);
		System.out.println("resutl="+resutl); 
		
		

	}

}
