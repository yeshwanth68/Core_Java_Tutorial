package Arrays;

class Student{
	int rollno;
	String name;
	int marks;
}


public class ArrayofObject {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.rollno=101;
		s1.name="Yeshwanth";
		s1.marks=80;
		
		Student s2 = new Student();
		s2.rollno=102;
		s2.name="Vishal";
		s2.marks=99;
		
		System.out.println(s1.name+" : "+s1.marks);
		
		Student student[] = new Student[2];
		student[0]=s1;
		student[1]=s2;
		
		System.out.println("Array of object");
		
		for(int i=0;i<student.length;i++) {
			System.out.println(student[i].name+" : "+student[i].marks);
		}
		
		
		System.out.println("Enhanced for loop");
		
		for(Student stu: student) {
			System.out.println(stu.name+" : "+stu.marks);
		}
		

	}

}
