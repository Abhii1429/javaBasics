package Conditionals;
import java.util.Scanner;
public class divByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any positive integer : ");
        int n = sc.nextInt();
        if(n % 5 == 0) {
            System.out.println(n + " is divisible by 5");
        }
        else {
            System.out.println("Not divisible by 5");
        }
    }
}
