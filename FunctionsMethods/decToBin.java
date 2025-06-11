package FunctionsMethods;
import java.util.*;
public class decToBin {
    public static int DecToBin(int dec){
        int rem = 0;
        int pow = 0;
        int bin = 0;
        while(dec>0){
            rem = dec%2;
            bin = bin + (rem*(int)Math.pow(10,pow));
            pow++;
            dec = dec/2;
        }
    return bin;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number : ");
        int dec = sc.nextInt();
        System.out.println("The binary conversion of "+dec+" = "+DecToBin(dec));
    }
}
