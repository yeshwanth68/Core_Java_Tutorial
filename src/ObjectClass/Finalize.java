package ObjectClass;

class Person3 {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being garbage collected.");
    }
}

public class Finalize {

	public static void main(String[] args) {
		Person3 p = new Person3();
        p = null;
        System.gc(); 

	}

}
