package Interface;


interface yesh{
	
	void yeshwanth();
}

interface vish{
	
	void vishal();
}

class gokul implements yesh,vish{
	
	public void yeshwanth() {
		System.out.println("Hello yeshwanth!!..");
	}
	
	public void vishal() {
		System.out.println("Hello vishal!!...");
	}
}
public class MultipleInterface {

	public static void main(String[] args) {
		
		
		//gokul go = new gokul(); // it will able to access the both interface
		
		yesh obj;
		obj = new gokul();	
		obj.yeshwanth();   // this will access only the yesh interface, it has no idea about vish interface
		//obj.vishal();
		
	}

}
