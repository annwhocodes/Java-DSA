package Conditionals;
import java.util.Scanner;
public class ternary {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks out of 100");
        int marks = sc.nextInt();
        String result = ((marks>=33)? "Pass":"Fail");
        System.out.println(result);
    }
}
