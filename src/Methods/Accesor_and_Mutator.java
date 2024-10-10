package Methods;

public class Accesor_and_Mutator {
	
	private String name;
	
	public String getName() {  //Accesor
		return name;
	} 
	public void setName(String name) {  //Mutator
		this.name = name;
	}
	

	public static void main(String[] args) {
		
		Accesor_and_Mutator am = new Accesor_and_Mutator();
		
		am.setName("Yeshwanth");
		
		System.out.println("Name: "+am.getName());
	}

}
