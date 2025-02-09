import java.util.Scanner;

public class square {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        int n = sc.nextInt(); // For square pattern

        for (int i = 0; i < n; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < n; j++) {
                s.append("* ");
            }
            System.out.println(s);
        }
        sc.close(); // to prevent resource leak
    }
}
