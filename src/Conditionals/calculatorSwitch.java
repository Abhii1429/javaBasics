package Conditionals;
import java.util.Scanner;
public class calculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers to calculate :");
        int a = sc.nextInt();
        char op = sc.next().charAt(0);
        int b = sc.nextInt();
//        if(op == '+') System.out.println(a + b);
//        if(op == '-') System.out.println(a - b);
//        if(op == '*') System.out.println(a * b);
//        if(op == '/') System.out.println(a / b);

        switch(op){
            case '+' :
                System.out.println(a+b);
                break;
            case '-' :
                System.out.println(a-b);
                break;
            case '*' :
                System.out.println(a*b);
                break;
            case '/' :
                System.out.println(a/b);
                break;
            default : // act like "else" function in switch statement
                System.out.println("Invalid operator"); // when invalid operators entered
        }
    }
}
