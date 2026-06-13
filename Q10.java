//WAP to print prime number in a range
import java.util.*;

public class Q10  {

     public static boolean isPrime(int n) {
     int count = 0;

     // 0, 1 negative numbers are not prime
     if (n < 2){
     System.out.println("Given Number is not a prime number");
       return false;
     }
     // checking the number of divisors b/w 1 and the number n-1
     for (int i = 2; i < n; i++)
       { if (n % i == 0)
        return false;
       }

     // if reached here then must be true
     return true;
   }
   public static void main (String args[]) {
   Scanner sc = new Scanner(System.in);

   //Taking input
   System.out.print("Enter the ranger : ");

     int lower = 1;
     int upper = sc.nextInt();


     for (int i = lower; i <= upper; i++)
       if (isPrime (i))
        System.out.print(i+" ");
   }
   
 }