package Day6.program1;


import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person() {
        name = "Unknown";
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        Person person = new Person(name,age);
        person.printDetails();
        sc.close();
    }
}
