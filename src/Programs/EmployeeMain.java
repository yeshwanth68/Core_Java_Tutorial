package Programs;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private String gender;

    // Constructor
    public Employee(String name, String department, String gender) {
        this.name = name;
        this.department = department;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "', gender='" + gender + "'}";
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        // List of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "IT", "Male"));
        employees.add(new Employee("Sara", "HR", "Female"));
        employees.add(new Employee("Alex", "Finance", "Male"));
        employees.add(new Employee("Tina", "IT", "Female"));
        employees.add(new Employee("Sam", "Marketing", "Male"));
        employees.add(new Employee("Ella", "HR", "Female"));
        
        // Q1: How many male and female employees are there in the organization?
        Map<String, Long> genderCount = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        
        System.out.println(genderCount);
        
        System.out.println("Male employees: " + genderCount.getOrDefault("Male", 0L));
        System.out.println("Female employees: " + genderCount.getOrDefault("Female", 0L));
        
        // Q2: Print the name of all departments in the organization
        Set<String> departments = employees.stream()
                .map(Employee::getDepartment)
                .collect(Collectors.toSet());
        
        System.out.println("Departments in the organization: " + departments);
    }
}

