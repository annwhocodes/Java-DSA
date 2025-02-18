import java.util.Scanner;
public class question2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        while(counter>=0){
            System.out.println("Enter a number : ");
            int n= sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }
    }
}
