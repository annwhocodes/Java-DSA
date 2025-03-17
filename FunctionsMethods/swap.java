import java.util.*;
public class swap {
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("swapped value of a :"+a);//If these lines are written in the main function, the values will not be swapped
        System.out.println("swapped value of b :"+b);//because the changes made to a and b will remain only inside this function (this is an example of call by value) in java, variables are always called by value.
    }
    
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer(a) : ");
        int a = sc.nextInt();
        System.out.println("Enter the second integer(b) : ");
        int b = sc.nextInt();
        swap(a, b);

    }
    
}
