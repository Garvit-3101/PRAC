import java.util.Scanner;
public class Day3Q2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if ((num1 > num2) && (num2 > num3)){
            System.out.println(num1 +" is greates among these three numbers. ");
        }else if ((num2 > num1) && (num1 > num3)){
            System.out.println(num2 +" is greates among these three numbers. ");
        }else if ((num3 == num2) && (num2 == num1)){
            System.out.println("All numbers are equal to each other. ");
        }else{
            System.out.println(num3 + " is greatest among these three numbers. ");
        }
        sc.close();
    }
}
