import java.util.*;

public class question3 {
    public static boolean isPalindrome(int n){
        boolean isPalindrome = false;
        int myNum = n;
        int rev = 0;
        while (n>0){
            int rem = n%10;
            rev = rev*10 + rem;
            n=n/10;
        }
        if  (rev == myNum){
            isPalindrome = true;
        }
        return isPalindrome;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if (isPalindrome(n)){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
    }
   
}