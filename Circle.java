package Day7.program2.Shapes;

public class Circle {
    double radius;
    public Circle (double radius) {
        this.radius = radius;
    }    
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
