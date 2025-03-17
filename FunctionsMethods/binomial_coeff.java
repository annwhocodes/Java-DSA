package FunctionsMethods;
import java.util.*;
public class binomial_coeff {
    public static int factorial(int a){ //helper function
        int fact = 1;
        for (int i = 1; i<=a;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static int binomial(int n,int r){ 
        int n_fact = factorial(n);
        int r_fact = factorial (r);
        int nr_fact = factorial(n-r);
        int bc = n_fact/(r_fact*nr_fact);
        return bc;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r : ");
        int r = sc.nextInt();
        int binomial_c = binomial(n, r);
        System.out.println("The binomial coefficient is : "+binomial_c);
    }
}
