package FunctionsMethods;
import java.util.*;
public class binToDec {

    public static int BinToDec(int BinNum){
        int dec = 0;
        int pow = 0;
        while (BinNum>0){
            int LD = BinNum%10;
            dec = dec + (LD* (int)Math.pow(2,pow));
            pow++;
            BinNum=BinNum/10;
        }
        return dec;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number :");
        int bin = sc.nextInt();
        System.out.println("The decimal number of "+bin+" is = "+ BinToDec(bin));
        sc.close();
    }
}
