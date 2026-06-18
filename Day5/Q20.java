//WAP to find largest prime factor
import java.util.Scanner;

public class Q20 {
    public static long getLargestPrimeFactor(long n) {
        long maxPrime = -1;

        // Handle even numbers first
        while (n % 2 == 0) {
            maxPrime = 2;
            n >>= 1; // Equivalent to n / 2
        }

        // Handle odd numbers from 3 up to the square root of n
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i;
            }
        }

        // If the remaining n is a prime number greater than 2
        if (n > 2) {
            maxPrime = n;
        }

        return maxPrime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = scanner.nextLong();
        
        System.out.println("The largest prime factor is: " + getLargestPrimeFactor(num));
        scanner.close();
    }
}
