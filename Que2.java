package Day6.program2;

import java.util.Scanner;

class Animal {
    private String name;
    private String species;

    public Animal (String name, String species) {
        this.name = name;
        this.species = species;
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
    }
}

class Dog extends Animal{
    private String breed;

    public Dog (String name, String species, String breed) {
        super(name,species);
        this.breed = breed;
    }
    void printDetails() {
        super.printDetails();
        System.out.println("Breed: " + breed);
    }
}

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter species: ");
        String species = sc.nextLine();
        System.out.println("Enter breed: ");
        String breed = sc.nextLine();
        Dog d = new Dog(name, species, breed);
        d.printDetails();        
        sc.close();
    }
}
