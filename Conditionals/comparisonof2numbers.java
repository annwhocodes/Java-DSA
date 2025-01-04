package Conditionals;
import java.util.Scanner;
public class comparisonof2numbers {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b){
            System.out.println("The greater number is :"+a);
        }
        else if(b>a){
            System.out.println("The greater number is :"+b);
        }
        else{
            System.out.println("The numbers are equal");
        }
    }
    
}
