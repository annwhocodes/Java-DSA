package FunctionsMethods;
import java.util.*;
public class PNinrange {
    
    public static boolean isPrime(int n){
        boolean isPrime = true;
        if(n==2){
            return isPrime;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                isPrime = false;
            }
        }
        }
        
        return isPrime;
    }

    public static void PrimesInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        PrimesInRange(n);
        sc.close();
    }

}
