import java.util.Scanner;
public class sumofn {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int sum = 0;
        int count = 1;
        while(count<=n){
            sum=sum+count;
            count++;
        }
        System.out.println("The sum of first "+n+" Natural numbers is :"+sum);

    }
    
}
