import java.util.Scanner;
public class count1ton {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int count = 1;
        while(count<=n){
            System.out.print(count+" ");
            count++;
        }
    }
}
