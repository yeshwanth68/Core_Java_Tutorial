package Methods;

public class StaticMethods {
	
	
	static int sum(int a,int b) {
		int result = a+b;
		return result;
	}
	static void show()   
	{  
		System.out.println("It is an example of static method.");  
	} 

	public static void main(String[] args) {
		
		int ans = sum(1,3);
		System.out.println("Ans="+ans);
		show();

		

	}

}
