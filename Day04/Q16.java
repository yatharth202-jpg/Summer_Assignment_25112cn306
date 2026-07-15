//Write a program to print Armstrong numbers in a range
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the range
    
        int lower = 1;
        System.out.print("Enter upper bound: ");
        int upper = sc.nextInt();
        
        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");
        
        // Loop through the range and check each number
        for (int num = lower; num <= upper; num++) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
            }
        }
        
    }

    //verify if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNumber = num;
        int sum = 0;
        
        // Find total number of digits (order)
        int digits = String.valueOf(num).length();
        
        // Calculate the sum of powers of individual digits
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        
        // Compare the final calculated sum with the original number
        return sum == originalNumber;
    }
}