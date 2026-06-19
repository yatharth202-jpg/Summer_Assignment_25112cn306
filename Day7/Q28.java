//WAP to recursive reverse a number
import java.util.Scanner;

public class Q28 {
    
    public static int reverseRecursive(int num, int reversed) {
         if (num == 0) {
            return reversed;
        }
        
        int lastDigit = num % 10;
                
        int updatedReversed = (reversed * 10) + lastDigit;
        
        return reverseRecursive(num / 10, updatedReversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer to reverse: ");
        int number = sc.nextInt();
        
        int reversedNumber = reverseRecursive(number, 0);
        
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversedNumber);
        
        sc.close();
    }
}