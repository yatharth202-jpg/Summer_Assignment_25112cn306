//WAP to find largest prime factor
import java.util.*;

public class Q20 {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);

     //Taking input
     System.out.print("Enter a number : ");
     int n = sc.nextInt();
     int MaxPrime = -1;
 
     //for 0 and 1 
     if( n<2) {

         System.out.print("The largest prime factors of this number is : " + n);
    
     } else {
   
     for(int i = 2; i<=n ; i++) {

        //checking condions
        if(n%i == 0 && isPrime(i) == true) {
             MaxPrime = i;
        }

     }
       System.out.print("The max prime factors of this number is : " + MaxPrime );
   
    }  
       sc.close();
    }
    public static boolean isPrime(int n) {

        //for 0 and 1 
        if( n<2 ) {
          return false;
        }
        
        for(int i = 2; i< n ; i++) {
            if(n%i == 0) {
                return false;
            }
    }
    return true;
}
}

