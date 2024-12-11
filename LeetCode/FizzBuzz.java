import java.util.*;

class FizzBuzz {
    // Method to generate FizzBuzz list
    public List<String> FizzBuzz(int n) {
        List<String> arr = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arr.add("FizzBuzz");
            } else if (i % 3 == 0) {
                arr.add("Fizz");
            } else if (i % 5 == 0) {
                arr.add("Buzz");
            } else {
                arr.add(String.valueOf(i));
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        // Create an instance of FizzBuzz
        FizzBuzz fb = new FizzBuzz();
        List<String> result = fb.FizzBuzz(n);

        // Print the output
        System.out.println(result);
    }
}

