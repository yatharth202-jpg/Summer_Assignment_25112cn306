//WAP to count set bits in a number
import java.util.*;

public class Q23 {
    
    public static int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1); 
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        
        // Check if the input is a valid integer to avoid errors
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            
            int result = countSetBits(number);
            System.out.println("Number of set bits (1s) in " + number + " is: " + result);
        } else {
            System.out.println("Error: Please enter a valid integer.");
        }
        
        // Close the sc to prevent memory leaks
        sc.close();
    }
}