package FunctionsMethods;
import java.util.*;

public class functionoverload_data {
    //Overloading using different data types of return type
    public static int sum (int a,int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number : ");
        int p = sc.nextInt();
        System.out.println("Enter the second number :");
        int q = sc.nextInt();
        System.out.println("The sum is : "+sum(p,q));
        float b = sum(3.6f,8.9f); // Here we are using 3.6f instead of 3.6 to tell java that it is a floating point value and not a double data type, otherwise java treats it as a double.
        System.out.println(b);
    }
}
