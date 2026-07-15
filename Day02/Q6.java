//Write a program to reverse a number

import java.util.*;

public class Q6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        //input
    System.out.print("Enter a number : ");

    int n = sc.nextInt();
    int rev = 0 ;

    while(n!=0) {

        //Seprating the last digit
        int digit = n % 10 ;

        //adding it to a new variable 
        rev = rev*10 + digit;

        //Reducing the digits
        n = n/10;
        
    }
    //output
    System.out.print("The reverse of the given number is : "+rev);

    }
}
