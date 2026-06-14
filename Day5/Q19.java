//WAP to print factors of a number
import java.util.Scanner;

public class Q19 {

    public static void printPrimeFactors(int n) {
        // for negative numbers, 0, and 1
        if (n <= 1) {
            System.out.println("No prime factors for numbers less than or equal to 1.");
            return;
        }

        System.out.print("Prime factors of " + n + " are: ");

        //Divide out all the 2s
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        //n must be odd at this point. Loop through odd numbers up to sqrt(n)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // If n is still greater than 2, the remaining n itself is a prime number
        if (n > 2) {
            System.out.print(n);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            printPrimeFactors(number);
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        
    }
}
