import java.util.Scanner;
public class day2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a float value : ");
    float f = sc.nextFloat();
    int n = (int)f;
    System.out.println("Now the float value is typecasted from float to integer and the value now is : " + n);

    System.out.println("Now Enter any two integers : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("The sum of the two integers is : " + (a + b));
    System.out.println("Product of the two integers is : " + (a * b));
    System.out.println("Difference of the two integers is : " + (a - b));
    System.out.println("Division of the two integers is : " + (a / b));

    System.out.println("Now enter your age please : ");
    int age = sc.nextInt();
    System.out.println("You are " + age + " Years old.");
    sc.close();
    }
}
