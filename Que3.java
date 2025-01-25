package Day8.program3;

class Calculator {
    int multiply (int num1, int num2) {
        return num1 * num2;
    }
    double multiply (double num1, double num2) {
        return num1 * num2;
    }
}
public class Que3 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.multiply(5, 6));
        System.out.println(calc.multiply(5.5, 6.6));
    }
}
