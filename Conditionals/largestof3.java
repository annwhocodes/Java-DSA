package Conditionals;
import java.util.Scanner;
public class largestof3 {
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers for comparison : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if((a>=b) && (a>=c)){
        System.out.println("The greatest number among these is : " +a);
    }
    else if(b>=c){
        System.out.println("The greatest number among these is : "+b);
    }
    else{
        System.out.println("The greatest number among these is : "+c);
    }
}
}