package Day8.program1;

import java.util.Scanner;

class Employee {
    private String name;
    private double salary;
    public Employee (String name, double salary) {
        this.name = name;
        this.salary = salary;
    }   
}

class Manager extends Employee {
    private String department;
    public Manager (String name, double salary, String department) {
        super(name,salary);
        this.department = department;

        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Department : " + department);
    }
}
public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of Manager : ");
        String name = sc.nextLine();
        System.out.print("Enter the salary of Manager : ");
        double salary = sc.nextDouble();
        System.out.print("Now Enter the department of the Manager : ");
        String department = sc.next();
        Manager manager = new Manager(name,salary,department);
        sc.close();
    }
}
