package Conditionals;
import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        System.out.println("Enter operator : ");
        char op = sc.next().charAt(0);
        switch(op){
            case '+' : System.out.println("The addition is : "+(a+b));
                        break;
            case '-' : System.out.println("The subtraction is :"+(a-b));
                        break;
            case '*' : System.out.println("The multiplication is : "+(a*b));
                        break;
            case '/' : System.out.println("The division is :"+(a/b));
                        break;
            case '%' : System.out.println("The remainder is :"+(a%b));
                        break;
            default : System.out.println("Invalid operator ");
        }
    }
}
