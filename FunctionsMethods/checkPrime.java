package FunctionsMethods;
import java.util.*;
public class checkPrime {
    // public static boolean isPrime(int a){
    //     boolean isPrime = true;
    //     if (a==2){
    //         isPrime = true;
    //     }
    //     else{
    //         for(int i=2; i<=a-1; i++){
    //             if(a%i==0){
    //                 isPrime = false;
    //                 break;
    //             }
    //         }
    //     }
    //     return isPrime;

    //OPTIMIZED CODE 
    public static boolean isPrime(int a){
        boolean isPrime = true;
        if(a ==2){
            isPrime = true;
        }
        else{
            for(int i = 2; i<=Math.sqrt(a); i++){
                if(a%i ==0){
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int p = sc.nextInt();
        if(isPrime(p)){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number ");
        }
    }
}
