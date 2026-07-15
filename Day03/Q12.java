//WAP to find LCM of two number

import java.util.*;

public class Q12{
    //LCM = (a / GCD) * b 

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    
    public static int findLCM(int a, int b) {
        // Rearranged to (a / GCD) * b 
        return (a / findGCD(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calculate and display LCM
        int lcm = findLCM(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);

        sc.close();
    }
}