package FunctionsMethods;
import java.util.*;
public class question1 {
    public static double AverageOfThree(double a, double b, double c){
        double avg = (a+b+c)/3;
        return avg;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("The average of these numbers is : "+AverageOfThree(a, b, c));
    }
    
}
