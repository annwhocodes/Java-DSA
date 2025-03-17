package FunctionsMethods;
import java.util.*;
public class sum {
    public static int mysumfunction(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        System.out.println("Enter another number :");
        int b = sc.nextInt();
        System.out.println("The sum is : ");
        System.out.print(mysumfunction(a,b));
    }
}
