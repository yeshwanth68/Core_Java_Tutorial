package ConditionalStatement;

import java.util.Scanner;

public class NestedSwtichStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the department");
		String department = sc.nextLine();
		System.out.println("Enter the role");
        String role = sc.nextLine();

        switch (department) {
            case "IT":
                System.out.println("Department: IT");
                switch (role) {
                    case "Developer":
                        System.out.println("Role: Developer - Access granted to development tools.");
                        break;
                    case "Manager":
                        System.out.println("Role: Manager - Access granted to project management tools.");
                        break;
                    default:
                        System.out.println("Unknown role in IT department.");
                        break;
                }
                break;
            case "HR":
                System.out.println("Department: HR");
                switch (role) {
                    case "Recruiter":
                        System.out.println("Role: Recruiter - Access granted to recruitment tools.");
                        break;
                    case "Manager":
                        System.out.println("Role: Manager - Access granted to HR management tools.");
                        break;
                    default:
                        System.out.println("Unknown role in HR department.");
                        break;
                }
                break;
            default:
                System.out.println("Unknown department.");
                break;
        }
		
		

	}

}
