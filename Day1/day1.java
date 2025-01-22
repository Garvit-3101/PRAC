// package Day1;
import java.util.Scanner;
public class day1{
    public static void main(String[] args) {
        System.out.println("Hello World");

        int a = 1;
        float b = 2.0f;
        double c = 3.0;
        char d = 'a';
        boolean e = true;
        String f = "Hello";
        System.out.println(a);
        System.out.println("INT : " + a);
        System.out.println("FLOAT : " + b);
        System.out.println("DOUBLE : " + c);
        System.out.println("CHAR : " +d);
        System.out.println("BOOLEAN : "+e);
        System.out.println("STRING : "+f);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 values : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        double ave = (x+y) /2;
        System.out.println("Average of entered values is : "+ ave);
        sc.close();
    }
}