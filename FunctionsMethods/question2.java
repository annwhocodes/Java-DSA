package FunctionsMethods;
import java.util.Scanner;
public class question2 {
    public static boolean isEven(int n){
        boolean isEven = false;
        if(n%2==0){
            isEven = true;
        }
        return isEven;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        if(isEven(a)){
            System.out.println("It is even");
        }
        else{
            System.out.println("It is odd .");
        }
    }
}
