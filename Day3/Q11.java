package Day3;
//WAP to find GCD of two numbers
import java.util.*;

public class Q11{

    public static int findGCD(int a, int b) {
        // if the second number becomes 0, the first number is the GCD
        if (b == 0) {
            return a;
        }
        // call the method with b and the remainder of a divided by b
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();;

        int gcd = findGCD(num1, num2);

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);

    }
}