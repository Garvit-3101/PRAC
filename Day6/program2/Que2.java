package Day8.program2;

import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person() {
        name = "Unknown";
        age = 0;
    }

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

}

class Student extends Person {
    private int StudentId;
    public Student (String name, int age, int StudentId) {
        super(name,age);
        this.StudentId = StudentId;

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("StudenId : " + StudentId);
    }

}
public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        System.out.print("Enter StudentId : ");
        int StudentId = sc.nextInt();
        Student student = new Student(name, age, StudentId);
        sc.close();
    }
}
