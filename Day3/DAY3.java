// package Day3;
import java.util.Scanner;

public class DAY3 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 5;
        int num2 = 2;
        //Relational Operators
        System.out.println("Num 1 > Num 2 : "+ (num1 > num2));
        System.out.println("Num 1 < Num 2 : "+ (num1 > num2));
        System.out.println("Num 1 == Num 2 : "+ (num1 > num2));
        System.out.println("Num 1 != Num 2 : "+ (num1 > num2));
        System.out.println("Num 1 >=Num 2 : "+ (num1 > num2));
        System.out.println("Num 1 <= Num 2 : "+ (num1 > num2));
       
        //Logical Operators
        System.out.println("(3>4) && (4>5) : "+ ((3>4) && (5 != 6)));
        System.out.println("Num 1  Num 2 : "+ !(num1 > num2));
        sc.close();
    }
}
