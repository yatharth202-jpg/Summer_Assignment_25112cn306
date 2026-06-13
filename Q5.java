//Write a program to find the sum of digits of a number
import java.util.*;

public class Q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //input
      System.out.println("Enter a numbers : ");

        int n = sc.nextInt();
        int sum = 0 ;
   
       
        while (n > 0) {

//adding last digit in sum variable
      int temp = n%10 ;
      sum += temp;  
  
//seprating last digit of the given number

       n = n/10;
    }
    //output
   System.out.println("Sum of Digit of giving number is : " + sum);
    }
}