package Conditionals;
import java.util.Scanner;
public class incometax {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in full digits : ");
        int income = sc.nextInt();
        double tax = 0;
        if (income<500000){
            tax = 0;
        }
        else if (income>=500000 && income<=1000000){
            tax = (0.2)*income;
        }
        else{
            tax = (0.3)*income;
        }
        System.out.println("You have an income tax of rupees : "+tax);

    }
    
}
