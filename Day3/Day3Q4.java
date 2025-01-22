// package Day3;
import java.util.Scanner;
public class Day3Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = 0;
        int second = 1;
        System.out.print("Fibonnaci Series : " + first + " " + second);
        for (int i = 2; i < 10; i++){
            int next = first + second;
            System.out.print(" "+next);
            first = second;
            second = next;
        }
        sc.close();
    }
}
