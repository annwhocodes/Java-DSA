package Conditionals;
import java.util.Scanner;
public class Problem5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("It is a leap year");
                }
                else{
                    System.out.println("It is not a leap year");
                }
            }
            else{
                System.out.println("Leap year");
            }
        }
        else{
            System.out.println("not a leap year ");
            }
        }
}
