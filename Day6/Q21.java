//WAP to convert decimal to binary
import java.util.Scanner;

public class Q21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        
        // Handle the edge case for 0
        if (decimal == 0) {
            System.out.println("Binary equivalent: 0");
        } else {

            String binary = "";
            
            // Loop until the quotient becomes 0
            while (decimal > 0) {
                int remainder = decimal % 2;
                binary = remainder + binary; 
                decimal = decimal / 2;
            }
            
            System.out.println("Binary equivalent: " + binary);
        }
        
        sc.close();
    }
}
