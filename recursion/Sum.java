package Arithmetic;

public class Sum {

    public static int Sum(int n) {
        // Base case: if n is 1, the sum is 1
        if (n == 1) {
            return 1;
        } else {
            // Recursive case: n + sum of n-1
            return n + Sum(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = Sum(7); // Calculates the sum of numbers from 1 to 7
        System.out.println("Sum: " + result); // Output: Sum:
    }
}
