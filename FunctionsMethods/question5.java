package FunctionsMethods;

import java.util.Scanner;

public class question5 {
    public static int sumOfDigits(int n){
        int rem = 0;
        int sum = 0;
        while(n>0){
            rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        return sum;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("The sum of the digits in "+n+" is = "+sumOfDigits(n));
    }
}
