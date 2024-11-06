package EMPLOYEE;

import java.util.Scanner;

public class testEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        employee.setName (name);

        System.out.print("Enter employee age: ");
        int age = sc.nextInt();
        employee.setAge(age);

        System.out.print("Enter employee salary: ");
        int salary = sc.nextInt();
        employee.setSalary(salary);

        sc.close();

        System.out.println("Employee details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());

        System.out.println(employee.getEmployeeDetails());

    }
}
