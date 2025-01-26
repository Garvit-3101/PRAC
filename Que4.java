package Day8.program4;

class Shape {
    void draw() {
        System.out.println("Drawing a Shape!!!");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drwaing a circle!!!");
    }
}

class Rectangle {
    void draw() {
        System.out.println("Drawing a rectangle!!!");
    }
}


public class Que4 {
    public static void main(String[] args) {
        Shape s = new Shape();
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        s.draw();
        c.draw();
        r.draw();
    }
}
