//WAP to print factors of a number
import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        System.out.print("Prime factors: ");
        printPrimeFactors(n);
        
        sc.close();
    }

    public static void printPrimeFactors(int n) {
        // Handle negative numbers, 0, and 1
        if (n <= 1) {
            System.out.println("No prime factors for numbers less than or equal to 1.");
            return;
        }

        //Print the number of 2s that divide n
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        // n must be odd at this point. Loop for odd numbers up to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        //If n is still greater than 2, then n itself is prime
        if (n > 2) {
            System.out.print(n);
        }
        System.out.println();
    }
}