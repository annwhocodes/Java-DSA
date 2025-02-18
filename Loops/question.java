import java.util.Scanner;
public class question {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int counter=0;
        while(counter>=0){
            int num = sc.nextInt();
            if(num%10==0){
                break;
            }
            counter++;
        }
        System.out.println("Exited loop");
    }
}
