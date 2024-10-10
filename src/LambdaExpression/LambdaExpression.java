package LambdaExpression;

@FunctionalInterface
interface A{
	int add(int i, int j);
}

public class LambdaExpression {

	public static void main(String[] args) {
		
		A obj = (i,j) -> i+j;
		
		int result = obj.add(10, 10);
		System.out.println("Result="+result);
		

	}

}
