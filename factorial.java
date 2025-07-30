// write a program to calculate factorial of a number using recursion and without recursion
public class Factorial {

    public static void main(String[] args) {
        int number = -3; // Example number
        System.out.println("Factorial of " + number + " using recursion: " + factorialWithRecursion(number));
        System.out.println("Factorial of " + number + " without recursion: " + factorialWithoutRecursion(number));
    }

    // Method to calculate factorial using recursion
    public static int factorialWithRecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialWithRecursion(n - 1);
    }

    // Method to calculate factorial without recursion
    public static int factorialWithoutRecursion(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}