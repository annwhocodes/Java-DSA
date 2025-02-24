import java.util.*;

public class Problem2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int evensum = 0;
        int oddsum = 0;
        int choice;  // Declare choice outside the loop

        do { 
            System.out.println("Enter a number:");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evensum += num;
            } else {
                oddsum += num;
            }

            System.out.println("Press 1 if you wish to continue:");
            choice = sc.nextInt(); 

        } while (choice == 1);

        System.out.println("The sum of odd numbers: " + oddsum);
        System.out.println("The sum of even numbers: " + evensum);
        
        sc.close();
    }
}
