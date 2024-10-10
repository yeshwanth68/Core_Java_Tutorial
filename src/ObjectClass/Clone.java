package ObjectClass;

class person2 implements Cloneable {
    String name;
    int age;

    person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Clone {

	public static void main(String[] args) throws CloneNotSupportedException {
		person2 p1 = new person2("Yeshwanth", 30);
		person2 p2 = (person2) p1.clone();
        System.out.println(p2.name);

	}

}
