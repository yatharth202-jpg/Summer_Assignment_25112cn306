//WAP to vheck number is a strong number or not
import java.util.*;

public class Q18 {

    //calculate the factorial of a single digit
    public static int getFactorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to check: ");
        int originalNumber = sc.nextInt();
        
        int temp = originalNumber;
        int sumOfFactorials = 0;
        
        // Loop to extract each digit and sum up its factorial
        while (temp > 0) {
            int digit = temp % 10;        
            sumOfFactorials += getFactorial(digit); 
            temp = temp / 10;              
        }
        
        // Final comparison
        if (sumOfFactorials == originalNumber) {
            System.out.println(originalNumber + " is a Strong Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Strong Number.");
        }
        
    }
}
