package Conditionals;
import java.util.Scanner;
public class Problem1 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if (num>=0){
            System.out.println("It is a positive number");
        }
        else{
            System.out.println("It is a negative number ");
        }
    }
}
