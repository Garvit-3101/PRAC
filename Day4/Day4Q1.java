// package Day4;
import java.util.Scanner;

class Calculator{
    int ADD(int num1, int num2){
        return num1 + num2;
    }
    int DIFFERENCE(int num1, int num2) {
        return num1 - num2;
    }
    int MULTIPLY(int num1, int num2) {
        return num1 *  num2;
    }
    int DIVIDE(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Please do not enter zero as divident. ");
        }
        return num1 / num2;
    }
    
}

public class Day4Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Addition : " + calc.ADD(num1, num2));
        System.out.println("Difference : " + calc.DIFFERENCE(num1, num2));
        System.out.println("Multiplication : " + calc.MULTIPLY(num1, num2));
        System.out.println("Division : " + calc.DIVIDE(num1, num2));
        sc.close();
    }
}
