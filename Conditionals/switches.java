package Conditionals;
import java.util.Scanner;
public class switches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        switch (number){
            case 1 : System.out.println("Samosa");
            break;
            case 2 : System.out.println("Burger");
            break;
            case 3 : System.out.println("mango shake");
            break;
            default : System.out.println("We wake up");
        }
    }
    
}
