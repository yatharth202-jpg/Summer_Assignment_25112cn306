//WAP to convert binary to decimal
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a binary number: ");
        long binary = sc.nextLong();
        
        long decimal = 0;
        long power = 0;
        long temp = binary;
        
        // Loop to convert binary to decimal
        while (temp > 0) {
            long lastDigit = temp % 10; 
            decimal += lastDigit * Math.pow(2, power); 
            temp = temp / 10; 
            power++; 
        }
        
        System.out.println("Decimal number: " + decimal);
        sc.close();
    }
}