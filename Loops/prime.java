import java.util.*;
public class prime {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(n==1){
            System.out.println("1 is a universal number.");
        }
        else if(n==2){
            System.out.println("It is a prime number");
        }
        else{
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("It is a composite number.");
                break;
            }
            else{
                System.out.println("It is a prime number.");
                break;
            }
        }
    }
    }
}
