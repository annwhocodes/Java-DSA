package Conditionals;
import java.util.Scanner;
public class Problem2 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your temperature in farenheit :");
        double temp = sc.nextDouble();
        if (temp>=100){
            System.out.println("You have fever!");
        }else{
            System.out.println("You don't have fever.");
        }

    }
    
}
