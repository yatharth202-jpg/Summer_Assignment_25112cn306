//Write a program to calculate sum of first N natural number
import java.util.*;

public class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //input
      System.out.println("Enter two numbers");

      System.out.print("Enter 1st numbers : ");
        int a = sc.nextInt();

      System.out.print("Enter 2nd numbers : ");
        int b = sc.nextInt();

        int sum = a + b;

        //output
      System.out.print("Sum of " + a + " and " + b + " is : " + sum);

    }
}