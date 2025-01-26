package Day9.program1;

import java.util.Scanner;

import org.w3c.dom.css.Rect;

import Circle;
import Rectangle;
import Shape;

abstract class Shape {
    abstract double area();
    void display() {
        System.out.println("Displaying Shape Details.");
    }
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    double area () {
        return 3.14 * radius * radius;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Area : " + area());
    }
}

class Rectangle extends Shape {
    private double length, width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Area : " + area());
    }
}


public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle(5.00);
        Rectangle r = new Rectangle(5.0, 6.0);
        c.display();
        r.display();
        sc.close();
    }
}
