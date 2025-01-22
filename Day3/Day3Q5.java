// package Day3;
import java.util.Scanner;
public class Day3Q5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a integer of which you want to print the table : ");
    int num = sc.nextInt();
    for(int i = 1; i <= 10; i++) {
        System.out.println(num + " * " + i + " = " + (num * i));
    }
    sc.close();
    }
}
