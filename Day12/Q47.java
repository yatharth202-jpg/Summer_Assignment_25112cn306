package Assignment.Day12;

import java.util.Scanner;

//WAP to write function for Fibonacci
public class Q47 {
      public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.print("The Fibonacci series is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        sc.close();
    }
}
