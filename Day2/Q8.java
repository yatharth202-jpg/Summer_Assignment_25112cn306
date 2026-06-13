//Write a program to check wheather a number is palindrome

import java.util.*;

public class Q8 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        //input
    System.out.print("Enter a number : ");

    int n = sc.nextInt();
    int rev = 0 ;
    int OriginNum = n;

    while(n!=0) {
 
        //Seprating the last digit
        int digit = n % 10 ;

        //adding it to a new variable 
        rev = rev*10 + digit;

        //Reducing the digits
        n = n/10;
        
    }

     //checking condition and printing output

    if(rev == OriginNum){
        System.out.print("The given is a palindrome number");
} else {
        System.out.print("The given is not a palindrome number");
       }
}
   
    }


