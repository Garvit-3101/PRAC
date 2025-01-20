import java.util.Scanner;

public class Day3Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer value to know about the season : ");
        int season = sc.nextInt();
        switch (season) {
            case 1:
            System.out.println("Spring");
            break;
            case 2:
            System.out.println("Summer");
            break;
            case 3:
            System.out.println("Fall");
            break;
            case 4:
            System.out.println("Winter");
            break;
            case 5:
            System.out.println("Invalid Input.");
            break;
            default:
            break;
            
        }
        sc.close();        
    }
}
